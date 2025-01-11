package com.example.demo.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.ApiCall;
import com.example.demo.Entity.Weather;
import com.example.demo.Repository.UserRepository;
import com.example.demo.security.SecurityUtils;

import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	Random rand=new Random(); 
	
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/temp")
	public String getTemp(Model model){
		model.addAttribute("weather",new Weather());
		return "index.html";
	}
	
	@RequestMapping("/api")
	public String api(Model model){
		model.addAttribute("apicall",new ApiCall());		
		return "api.html";
	}
	
	@RequestMapping("/key")
	public String apikey(Model model){
    	String value=SecurityUtils.getLoggedInUsername();
    	com.example.demo.Entity.User user=userRepo.getUserByUserName(value);
    	model.addAttribute("key",user.getApikey());
    	return "key";
	}	
	
	@RequestMapping("/apiresponse")
	public String apiResponse(){
		return "apiresponse";
	}
	
	
	@RequestMapping("/freeplan")
	public String freePlan(Model model){
		model.addAttribute("weather",new Weather());
		return "index.html";
	}
	
	@RequestMapping("/pricing")
	public String pricing(){	
		System.out.println("accessing user pricing");
		return "pricing";
	}
	
	//payment completion
	@RequestMapping("/SuccessStarter")
	public String paymentSuccessStarter(){
		return "SuccessStarter";
	}
	@RequestMapping("/SuccessEnterprise")
	public String paymentSuccessEnterprise(){
		return "SuccessEnterprise";
	}
}
