package com.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Address address() {
		return new Address("12","6th Downstreet","Darbhaga","Bihar");
	}
	
	@Bean
	public Person person() {
		return new Person(1234,"Abhinav Kumar",22,address());
	}
}
