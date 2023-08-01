package com.example;

public class Address {
	
	private String hNo;
	private String streetName;
	private String city;
	private String state;
	public Address(String hNo, String streetName, String city, String state) {
		super();
		this.hNo = hNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}
	public Address() {
		super();
	}
	public String gethNo() {
		return hNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public void sethNo(String hNo) {
		this.hNo = hNo;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", streetName=" + streetName + ", city=" + city + ", state=" + state + "]";
	}
}
