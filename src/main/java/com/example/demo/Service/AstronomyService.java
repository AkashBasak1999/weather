package com.example.demo.Service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.APIEntities.Astronomy.AstronomyUpdate;
import com.example.demo.APIEntities.Forcast.Forcast;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

@Component
public class AstronomyService {
	
//http://api.weatherapi.com/v1/astronomy.json?key=eff5765c0da04dba997132707250701&q=London&dt=2025-01-11
	@Autowired
	RestTemplate rest;
	
	public AstronomyUpdate getTemp(String city) {
	
	LocalDate local=LocalDate.now();	
	String APIkey="eff5765c0da04dba997132707250701";
	String locAPI="http://api.weatherapi.com/v1/astronomy.json?key=eff5765c0da04dba997132707250701&q=city&dt=date";
	String locationAPI=locAPI.replace("city",city);
	String locationWithDateAPI=locationAPI.replace("date",local.toString());

	System.out.println(locationAPI);

	ResponseEntity<AstronomyUpdate> respond=rest.exchange(locationAPI,HttpMethod.GET,null, AstronomyUpdate.class);
    // Handle the response
    System.out.println(" hello "+respond.getBody());


    AstronomyUpdate responseBody= respond.getBody();

	return responseBody;
	}

}

