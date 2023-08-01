package com.javaconfig;

import org.springframework.context.annotation.Bean;

public class Config {
	@Bean
	public Citizen getCitizen() {
		return new Citizen("Ajay Saxena Java",20);
	}
	
	@Bean
	public AadharCard getAadharCard() {
		return new AadharCard(getCitizen(),true);
	}
}
