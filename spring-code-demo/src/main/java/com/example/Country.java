package com.example;

import java.util.Map;

public class Country {
	private String countryName;
	private String currencyName;
	private Map<String,String> states;
	public String getCountryName() {
		return countryName;
	}
	public String getCurrencyName() {
		return currencyName;
	}
	public Map<String, String> getStates() {
		return states;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public void setStates(Map<String, String> states) {
		this.states = states;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", currencyName=" + currencyName + ", states=" + states + "]";
	}
	
	
}
