package com.example.demo.Entity;

public class Weather {
	private String city;
	
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Weather(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Weather [city=" + city + "]";
	}
}
