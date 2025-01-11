package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.APIEntities.Forcast.Forcast;
import com.example.demo.Entity.WeatherResponse;

@Component
public class ForcastService {
	@Autowired
	RestTemplate rest;
	
	public Forcast getTemp(String city) {
	String APIkey="eff5765c0da04dba997132707250701";
	String API="http://api.weatherapi.com/v1/forecast.json?key=eff5765c0da04dba997132707250701&q=city&days=1&aqi=no&alerts=no";
	String locAPI=API.replace("city", city);
	
	ResponseEntity<Forcast> respond=rest.exchange(locAPI,HttpMethod.GET,null, Forcast.class);
    // Handle the response
    System.out.println(" hello "+respond.getBody());
	Forcast responseBody= respond.getBody();
	return responseBody;
	}
}
