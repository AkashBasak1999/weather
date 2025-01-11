package com.example.demo.Controller;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.helper.Message;
import com.example.demo.security.SecurityUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.demo.APIEntities.Astronomy.AstronomyUpdate;
import com.example.demo.APIEntities.Forcast.Forcast;
import com.example.demo.Entity.ApiCall;
import com.example.demo.Entity.User;
import com.example.demo.Entity.Weather;
import com.example.demo.Entity.WeatherResponse;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.AstronomyService;
import com.example.demo.Service.CurrentService;
import com.example.demo.Service.ForcastService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@org.springframework.stereotype.Controller
public class ServiceController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder passwordencoder;// this encoder is included here for changing the password
	@Autowired
	SecurityUtils sec;
	@Autowired
	ObjectMapper objectMapper;
	@Autowired
	CurrentService service;
	@Autowired
	ForcastService forcastService;
	@Autowired
	AstronomyService astronomyService;

	
	
	
	@GetMapping("/signin")
	public String customLogin(HttpSession session, Model model) {
		model.addAttribute("title", "Login-Page");
		System.out.println(sec.getLoggedInUsername());
		return "loginSecurity";
	}

	@GetMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title", "Login-Page");
		model.addAttribute("user", new User());
		return "signup";
	}

	@GetMapping("/do_Register")
	public ModelAndView register(@Valid @ModelAttribute("user") User user, BindingResult result,
			@RequestParam(value = "agreement", defaultValue = "false") boolean agreement, Model model,
			HttpSession session) {
		System.out.println(".............." + user);
		try {
			
			if(result.hasErrors()) {
				System.out.println(result.toString());
				model.addAttribute("user",user);
				return new ModelAndView("signup"); 
			}
			
			Random rand=new Random();
			Integer key=rand.nextInt(1000000);

	    	user.setApikey(key);
	        model.addAttribute("key",key);			
			
			user.setRole("ROLE_USER");
			user.setPassword(passwordencoder.encode(user.getPassword()));
			user.setPremium("free");

			System.out.println("Agreement" + agreement);
			System.out.println("USER" + user);

			userRepository.save(user);

			model.addAttribute("user", new User());
			session.setAttribute("message", new Message("Succesfully Registered!!", "alert-success"));

			return new ModelAndView("redirect:/");
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("user", user);
			session.setAttribute("message", new Message("Something went wrong!!" + e.getMessage(), "alert-danger"));
			return new ModelAndView("signup");
		}
	}

	@RequestMapping("/forget")
	public String forgetPassword() {
		return "forgetPassword";
	}

	@RequestMapping("/cancel")
	public String paymentFailed() {
		return "cancel";
	}

	@RequestMapping("/user/setPremium/starter")
	public String setPremimumStarter(HttpSession session) {
		System.out.println("accessing starter");
		String name = (String) session.getAttribute("loggeduser");
		User user = userRepository.getUserByUserName(name);
		user.setPremium("starter");
		userRepository.save(user);
		return "redirect:/user/temp";
	}

	@RequestMapping("/user/setPremium/enterprise")
	public String setPremimumEnterprise(HttpSession session) {
		System.out.println("accessing enterprise");
		String name = (String) session.getAttribute("loggeduser");
		User user = userRepository.getUserByUserName(name);
		user.setPremium("enterprise");
		userRepository.save(user);
		return "redirect:/user/temp";
	}

	// API response

	@RequestMapping("/submit")
	public String handleFormSubmission(@RequestParam String action, @RequestParam String username,
			@RequestParam String email) {
		if ("save".equals(action)) {
			// Handle saving the form data
		} else if ("submit".equals(action)) {
			// Handle submitting the form data
		}
		return "resultPage";
	}

	
	
	
	
//	http://localhost:8080/api/current/242196/kolkata
	@RequestMapping("/api/current/{key}/{location}")
	public String apiCurrent(@PathVariable("key") String key,@PathVariable("location") String location, Model model) throws JsonProcessingException{
		Boolean token = false;
		
		User user=userRepository.findByApikey(Integer.parseInt(key));
		System.out.println(user.getApikey());
		List<User> allUser = (List<User>)userRepository.findAll();
		System.out.println(token);
		Iterator<User> itr=allUser.iterator();
		while(itr.hasNext()) {
			if(itr.next().getApikey().equals(Integer.parseInt(key))) {
				System.out.println("matched");
				token=true;
			}
		}
		if (token.equals(true)) {
			WeatherResponse resp= service.getTemp(location);
			System.out.println(resp);
			model.addAttribute("JSON",
			objectMapper.writeValueAsString(service.getTemp(location)));
			token=false;
			return "apiresponsesuccess";
		}
		else {
			model.addAttribute("JSON","You have entered wrong API key");				
			return "apiresponsefailed";
		}	
	}	
	@RequestMapping("api/current")
	public String current(@ModelAttribute("apicall") ApiCall apicall, Model model, HttpSession session)
			throws JsonProcessingException {
		String value = SecurityUtils.getLoggedInUsername();
		com.example.demo.Entity.User user = userRepository.getUserByUserName(value);

		Integer i = (Integer) apicall.getKey();

		Boolean token = false;
		
		List<User> allUser = (List<User>)userRepository.findAll();

		System.out.println(token);
		Iterator<User> itr=allUser.iterator();
		while(itr.hasNext()) {
			if(itr.next().getApikey().equals(i)) {
				System.out.println("matched");
				token=true;
			}
		}
		if (token.equals(true)) {
			WeatherResponse resp= service.getTemp((String) apicall.getLocation());
			System.out.println(resp);
			model.addAttribute("JSON",
			objectMapper.writeValueAsString(service.getTemp((String) apicall.getLocation())));
			token=false;
			return "apiresponsesuccess";
		}
		else {
			model.addAttribute("JSON","You have entered wrong API key");				
			return "apiresponsefailed";
		}
	}

	

	
	
//	http://localhost:8080/api/forcast/242196/kolkata
	@RequestMapping("/api/forcast/{key}/{location}")
	public String apiForcast(@PathVariable("key") String key,@PathVariable("location") String location, Model model) throws JsonProcessingException{
		Boolean token = false;
		
		User user=userRepository.findByApikey(Integer.parseInt(key));
		System.out.println(user.getApikey());
		List<User> allUser = (List<User>)userRepository.findAll();

		Iterator<User> itr=allUser.iterator();
		while(itr.hasNext()) {
			if(itr.next().getApikey().equals(Integer.parseInt(key))) {
				System.out.println("matched");
				token=true;
			}
		}
		
		if (token.equals(true)) {
			if(user.getPremium().equals("starter")||user.getPremium().equals("enterprise")){
			Forcast resp= forcastService.getTemp(location);
			System.out.println(resp);
			model.addAttribute("JSON",
			objectMapper.writeValueAsString(forcastService.getTemp(location)));
			token=false;
			return "apiresponsesuccess";
			}
			else {
				model.addAttribute("JSON","To get the forcast update you have to Upgrade your plan");			
				return "apiresponsefailed";
			}
		}
		else {
			model.addAttribute("JSON","You have provided wrong API key");				
			return "apiresponsefailed";
		}		
	}
	@RequestMapping("/api/forcast")
	public String forcast(@ModelAttribute("apicall") ApiCall apicall,Model model, HttpSession session) throws JsonProcessingException {
		String value = SecurityUtils.getLoggedInUsername();
		com.example.demo.Entity.User user = userRepository.getUserByUserName(value);

		Integer i = (Integer) apicall.getKey();

		Boolean token = false;
		
		List<User> allUser = (List<User>)userRepository.findAll();

		System.out.println(token);
		Iterator<User> itr=allUser.iterator();
		while(itr.hasNext()) {
			if(itr.next().getApikey().equals(i)) {
				System.out.println("matched");
				token=true;
			}
		}
		if (token.equals(true)) {
			if(user.getPremium().equals("starter")||user.getPremium().equals("enterprise")){
			Forcast resp= forcastService.getTemp((String) apicall.getLocation());
			System.out.println(resp);
			model.addAttribute("JSON",
			objectMapper.writeValueAsString(forcastService.getTemp((String) apicall.getLocation())));
			token=false;
			return "apiresponsesuccess";
			}
			else {
				model.addAttribute("JSON","To get the forcast update you have to Upgrade your plan");			
				return "apiresponsefailed";
			}
		}
		else {
			model.addAttribute("JSON","You have provided wrong API key");				
			return "apiresponsefailed";
		}
	}

	
	
	
//	http://localhost:8080/api/astronomy/242196/kolkata
	@RequestMapping("/api/astronomy/{key}/{location}")
	public String apiAstronomy(@PathVariable("key") String key,@PathVariable("location") String location, Model model) throws JsonProcessingException{
		
		Boolean token = false;
		
		User user=userRepository.findByApikey(Integer.parseInt(key));
		System.out.println(user.getApikey());
		List<User> allUser = (List<User>)userRepository.findAll();

		System.out.println(token);
		Iterator<User> itr=allUser.iterator();
		while(itr.hasNext()) {
			if(itr.next().getApikey().equals(Integer.parseInt(key))) {
				System.out.println("matched");
				token=true;
			}
		}
		if (token.equals(true)) {
			if(user.getPremium().equals("enterprise")) {
			AstronomyUpdate resp= astronomyService.getTemp(location);
			System.out.println(resp);
			model.addAttribute("JSON",
			objectMapper.writeValueAsString(astronomyService.getTemp(location)));
			token=false;
			return "apiresponsesuccess";
			}
			else {
				model.addAttribute("JSON","To get the Astronomy update you have to Upgrade your plan");
				return "apiresponsefailed";
			}
		}
		else{
			model.addAttribute("JSON","You have provided wrong API key");				
			return "apiresponsefailed";
		}
	}

	
	@RequestMapping("/api/astronomy")
	public String astronomy(@ModelAttribute("apicall") ApiCall apicall, Model model, HttpSession session) throws JsonProcessingException {
		String value = SecurityUtils.getLoggedInUsername();
		com.example.demo.Entity.User user = userRepository.getUserByUserName(value);

		Integer i = (Integer) apicall.getKey();

		Boolean token = false;
		
		List<User> allUser = (List<User>)userRepository.findAll();

		System.out.println(token);
		Iterator<User> itr=allUser.iterator();
		while(itr.hasNext()) {
			if(itr.next().getApikey().equals(i)) {
				System.out.println("matched");
				token=true;
			}
		}
		if (token.equals(true)) {
			if(user.getPremium().equals("enterprise")) {
			AstronomyUpdate resp= astronomyService.getTemp((String) apicall.getLocation());
			System.out.println(resp);
			model.addAttribute("JSON",
			objectMapper.writeValueAsString(astronomyService.getTemp((String) apicall.getLocation())));
			token=false;
			return "apiresponsesuccess";
			}
			else {
				model.addAttribute("JSON","To get the Astronomy update you have to Upgrade your plan");
				return "apiresponsefailed";
			}
		}
		else{
			model.addAttribute("JSON","You have provided wrong API key");				
			return "apiresponsefailed";
		}
	}
}
//http://api.weatherapi.com/v1/current.json?key=eff5765c0da04dba997132707250701&q=London&aqi=no
//http://api.weatherapi.com/v1/forecast.json?key=eff5765c0da04dba997132707250701&q=London&days=1&aqi=no&alerts=no
//http://api.weatherapi.com/v1/astronomy.json?key=eff5765c0da04dba997132707250701&q=London&dt=2025-01-11



