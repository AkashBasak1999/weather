package com.example.demo.Entity;

import java.util.List;

public class Location{
  	public List<Location> locations;
    public String q;
    public String custom_id;
    
    
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(List<Location> locations, String q, String custom_id) {
		super();
		this.locations = locations;
		this.q = q;
		this.custom_id = custom_id;
	}
	
	public List<Location> getLocations() {
		return locations;
	}
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	public String getQ() {
		return q;
	}
	public void setQ(String q) {
		this.q = q;
	}
	public String getCustom_id() {
		return custom_id;
	}
	public void setCustom_id(String custom_id) {
		this.custom_id = custom_id;
	}
    
    
}