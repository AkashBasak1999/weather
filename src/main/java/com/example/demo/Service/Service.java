package com.example.demo.Service;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Entity.LattitudeLongitude;
import com.example.demo.Entity.Location;
import com.example.demo.Entity.WeatherResponse;


@Component
public class Service {
	@Autowired
	RestTemplate rest;
	
	public WeatherResponse getTemp(String city) {
//	String GeoCodeingAPI="674fe090b64d7998054690jsi9379ab";
//	
//	Location location=new Location();
//	location.setQ("22.572645,88.363892");
//	location.setCustom_id("My_ID");
//	
//    // Set the headers (if necessary)
//    HttpHeaders headers = new HttpHeaders();
//    headers.set("Content-Type", "application/json");
//
//    // Create the HTTP entity with headers and body
//    HttpEntity<Location> entity = new HttpEntity<>(location, headers);

			
	System.out.println(city);	
	String key="d71ee18e7312464a82144040240412";
	String weatherAPI="http://api.weatherapi.com/v1/current.json?key=d71ee18e7312464a82144040240412&q=bulk";	
	String locationAPI="http://api.weatherapi.com/v1/current.json?key=d71ee18e7312464a82144040240412&q="+city+"&aqi=no";
	
	ResponseEntity<LattitudeLongitude> respond=rest.exchange(locationAPI,HttpMethod.GET,null, LattitudeLongitude.class);
	LattitudeLongitude responsePosition=respond.getBody();
	Double Lat=responsePosition.getLocation().getLat();
	Double Lon=responsePosition.getLocation().getLon();
	System.out.println(Lat);
	System.out.println(Lon);
	
	
	String rawJSONBody= 
	"{\r\n"
	+ "    \"locations\": [\r\n"
	+ "        {\r\n"
	+ "            \"q\": \"position\",\r\n"
	+ "            \"custom_id\": \"my-id-1\"\r\n"
	+ "        }\r\n"
	+ "    ]\r\n"
	+ "}";
	
	// position:=22.572645,88.363892
	String JSON=rawJSONBody.replace("position", ""+Lat+","+Lon+"");

	System.out.println(JSON);
	// Set the headers
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    
    // Wrap the raw JSON string in an HttpEntity
    HttpEntity<String> entity = new HttpEntity<>(JSON, headers);

    // Make the POST request
    ResponseEntity<WeatherResponse> response = rest.postForEntity(weatherAPI,entity,WeatherResponse.class);
    
    // Handle the response
    System.out.println(response.getBody());
    
	WeatherResponse responseBody= response.getBody();	

	return responseBody;	
	}		
}	
