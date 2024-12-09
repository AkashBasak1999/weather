package com.example.demo.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Entity.Weather;
import com.example.demo.Entity.WeatherResponse;
import com.example.demo.Service.Service;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	Service service;
	
	@RequestMapping("/temp")
	public String getTemp(Model model){
		model.addAttribute("weather",new Weather());
		return "index.html";
	}
	
	@RequestMapping("/show")
	public String Temp(@ModelAttribute("weather") Weather weather, Model model){
		System.out.println(weather);
//		Bulk response=service.getTemp(weather.getCity());	
		WeatherResponse response=service.getTemp(weather.getCity());
		
		System.out.println(response.getBulk().get(0).getQuery().getLocation().getCountry());
		System.out.println(response.getBulk().get(0).getQuery().getLocation().getName());
		System.out.println(response.getBulk().get(0).getQuery().getCurrent().getTemp_c());
		System.out.println(response.getBulk().get(0).getQuery().getCurrent().getHumidity());
		System.out.println(response.getBulk().get(0).getQuery().getCurrent().getFeelslike_c());
		
		System.out.println(response.getBulk().get(0).getQuery().getCurrent().getWind_kph());
		System.out.println(response.getBulk().get(0).getQuery().getCurrent().getWind_degree());
		System.out.println(response.getBulk().get(0).getQuery().getCurrent().getWind_dir());
		System.out.println(response.getBulk().get(0).getQuery().getCurrent().getPressure_in());
		System.out.println(response.getBulk().get(0).getQuery().getCurrent().getPrecip_in());		
		
		model.addAttribute("rescountry", response.getBulk().get(0).getQuery().getLocation().getCountry());
		model.addAttribute("rescity", response.getBulk().get(0).getQuery().getLocation().getName());
		model.addAttribute("restemp", response.getBulk().get(0).getQuery().getCurrent().getTemp_c());
		model.addAttribute("resuv",response.getBulk().get(0).getQuery().getCurrent().getUv());
		model.addAttribute("resfeelslike",response.getBulk().get(0).getQuery().getCurrent().getFeelslike_c());
		model.addAttribute("reshumidity",response.getBulk().get(0).getQuery().getCurrent().getHumidity());
		model.addAttribute("time",new Date());
		
		model.addAttribute("wind_speed",response.getBulk().get(0).getQuery().getCurrent().getWind_kph());
		model.addAttribute("wind_degree",response.getBulk().get(0).getQuery().getCurrent().getWind_degree());
		model.addAttribute("wind_dir",response.getBulk().get(0).getQuery().getCurrent().getWind_dir());
		model.addAttribute("pressure",response.getBulk().get(0).getQuery().getCurrent().getPressure_in());
		model.addAttribute("precip",response.getBulk().get(0).getQuery().getCurrent().getPrecip_in());
			
		return "temp.html";
	}
}
