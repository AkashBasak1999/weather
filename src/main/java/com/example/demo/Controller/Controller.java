package com.example.demo.Controller;

import java.util.Date;

import com.example.demo.Entity.WeatherResponse;
import com.example.demo.security.SecurityUtils;

import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Entity.Weather;
import com.example.demo.Service.CurrentService;
import com.example.demo.paymentStarter.StripeServiceStarter;

import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	CurrentService service;
//SecurityUtils.getLoggedInUsername()
	
	@RequestMapping("/")
	public String getTemp(Model model){
		model.addAttribute("weather",new Weather());
		return "index.html";
	}
	
	@RequestMapping("/loggedTemp")
	public String getLoggedTemp(Model model){
		model.addAttribute("weather",new Weather());
		return "loggedindex.html";
	}
	
	
	@RequestMapping("/userindex")
	public String userTemp(Model model){
		model.addAttribute("weather",new Weather());
		return "userindex.html";
	}
	
	@RequestMapping("/show")
	public String Temp(@ModelAttribute("weather") Weather weather, Model model){
		System.out.println(weather);
//		Bulk response=service.getTemp(weather.getCity());	
		WeatherResponse response=service.getTemp(weather.getCity());

		model.addAttribute("rescountry", response.getLocation().getCountry());
		model.addAttribute("rescity", response.getLocation().getName());
		model.addAttribute("restemp", response.getCurrent().getTemp_c());
		model.addAttribute("resuv",response.getCurrent().getUv());
		model.addAttribute("resfeelslike",response.getCurrent().getFeelslike_c());
		model.addAttribute("reshumidity",response.getCurrent().getHumidity());
		model.addAttribute("time",new Date());

		model.addAttribute("wind_speed",response.getCurrent().getWind_kph());
		model.addAttribute("wind_degree",response.getCurrent().getWind_degree());
		model.addAttribute("wind_dir",response.getCurrent().getWind_dir());
		model.addAttribute("pressure",response.getCurrent().getPressure_in());
		model.addAttribute("precip",response.getCurrent().getPrecip_in());
		model.addAttribute("heatindex",response.getCurrent().getHeatindex_c());
		model.addAttribute("dewpoint",response.getCurrent().getDewpoint_c());
			
		return "temp.html";
	}
}
