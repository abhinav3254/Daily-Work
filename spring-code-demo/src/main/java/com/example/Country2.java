package com.example;

import java.util.Set;

public class Country2 {
	private String countryName;
	private String currencyName;
	private Set<String> states;
	public String getCountryName() {
		return countryName;
	}
	public String getCurrencyName() {
		return currencyName;
	}
	public Set<String> getStates() {
		return states;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public void setStates(Set<String> states) {
		this.states = states;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", currencyName=" + currencyName + ", states=" + states + "]";
	}
	public Country2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
