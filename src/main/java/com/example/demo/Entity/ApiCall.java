package com.example.demo.Entity;

public class ApiCall {
	private Integer key;
	private String location;
	public ApiCall(Integer key, String location) {
		super();
		this.key = key;
		this.location = location;
	}
	public ApiCall() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "ApiCall [key=" + key + ", location=" + location + "]";
	}
}
