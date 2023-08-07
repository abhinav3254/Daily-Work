package com.sir8august.query.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="address") 
public class Address {
	@Id
	private int id;
	private String houseNumber;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	
	public Address() {}
	
	public Address(int id, String houseNumber, String city, String state, String country, String zipCode) {
		super();
		this.id = id;
		this.houseNumber = houseNumber;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}
	public int getId() {
		return id;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", houseNumber=" + houseNumber + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", zipCode=" + zipCode + "]";
	}
	
	
}
