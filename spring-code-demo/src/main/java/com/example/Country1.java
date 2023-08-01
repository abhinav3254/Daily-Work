package com.example;

import java.util.List;

public class Country1 {
	private String countryName;
	private String currencyName;
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", currencyName=" + currencyName + ", states=" + states + "]";
	}
	private List<String> states;
	
	private Country1() {}
	
	public String getCountryName() {
		return countryName;
	}
	public String getCurrencyName() {
		return currencyName;
	}
	public List<String> getStates() {
		return states;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public void setStates(List<String> states) {
		this.states = states;
	}
	
}
