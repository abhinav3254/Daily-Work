package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.annotation")
public class Config {
//	@Bean()
//	public AadharCard AadharCard() {
//		return new AadharCard(citizen(),true);
//	}
//	
//	@Bean()
//	public Citizen citizen() {
//		return new Citizen("Jogesh",55);
//	}
}
