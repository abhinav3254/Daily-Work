package com.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.javaconfig")
public class Config {
	/*
	@Bean()

	public Address address() {
		return new Address("12","6th Downstreet","Darbhaga","Bihar");
	}
	
	@Bean(initMethod = "inItPerson",destroyMethod = "destroyPerson")
//	@Scope("prototype")
	public Person person() {
		return new Person(1234,"Abhinav Kumar",22,address());
	}

	
//	@Bean(autowireCandidate = true)
	@Bean()
	public Address address() {
		return new Address("12","6th Downstreet","Darbhaga","Bihar");
	}
	
	@Bean()
	public Person person() {
		Person person = new Person();
		person.setSsn(101);
		person.setName("Ajay Saxena");
		person.setAge(22);
		return person;
	}
		*/
}
