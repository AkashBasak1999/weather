package com.example.demo.Service;


import com.example.demo.Entity.WeatherResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class CurrentService {
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





//approach:1
//	System.out.println(city);
//	String APIkey="eff5765c0da04dba997132707250701";
//	String weatherAPI="http://api.weatherapi.com/v1/current.json?key=eff5765c0da04dba997132707250701&q=bulk";
//
//	String locAPI="http://api.weatherapi.com/v1/current.json?key=eff5765c0da04dba997132707250701&q=city&aqi=no";
//	String locationAPI=locAPI.replace("city",city);
//
//	System.out.println(locationAPI);
//
//	ResponseEntity<LattitudeLongitude> respond=rest.exchange(locationAPI,HttpMethod.GET,null, LattitudeLongitude.class);
//	LattitudeLongitude responsePosition=respond.getBody();
//	Double Lat=responsePosition.getLocation().getLat();
//	Double Lon=responsePosition.getLocation().getLon();
//	System.out.println(Lat);
//	System.out.println(Lon);
//
//
//	String rawJSONBody=
//	"{\r\n"
//	+ "    \"locations\": [\r\n"
//	+ "        {\r\n"
//	+ "            \"q\": \"position\",\r\n"
//	+ "            \"custom_id\": \"my-id-1\"\r\n"
//	+ "        }\r\n"
//	+ "    ]\r\n"
//	+ "}";
//
//	// position:=22.572645,88.363892
//	String JSON=rawJSONBody.replace("position", ""+Lat+","+Lon+"");
//
//	System.out.println(JSON);
//	// Set the headers
//    HttpHeaders headers = new HttpHeaders();
//    headers.setContentType(MediaType.APPLICATION_JSON);
//
//    // Wrap the raw JSON string in an HttpEntity
//    HttpEntity<String> entity = new HttpEntity<>(JSON, headers);
//
//    // Make the POST request
//    ResponseEntity<WeatherResponse1> response = rest.postForEntity(weatherAPI,entity,WeatherResponse1.class);
//
//    
//    // Handle the response
//    System.out.println(response.getBody());
//
//	WeatherResponse1 responseBody= response.getBody();
//
////	return responseBody;


		//approach:2

	String APIkey="eff5765c0da04dba997132707250701";
	String locAPI="http://api.weatherapi.com/v1/current.json?key=eff5765c0da04dba997132707250701&q=city&aqi=no";
	String locationAPI=locAPI.replace("city",city);

	System.out.println(locationAPI);

	ResponseEntity<WeatherResponse> respond=rest.exchange(locationAPI,HttpMethod.GET,null, WeatherResponse.class);
    // Handle the response
    System.out.println(" hello "+respond.getBody());


	WeatherResponse responseBody= respond.getBody();

	System.out.println(respond.getBody().getCurrent().getFeelslike_c());
	return responseBody;
	}
}	
