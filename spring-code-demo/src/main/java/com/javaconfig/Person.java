package com.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Service
//@Repository
//@Controller
@Component
public class Person {
	private int ssn = 101;
	private String name ="Abhinav Jha";
	private int age = 20;
	@Autowired
	private Address address;
	public Person() {
		super();
	}
	public Person(int ssn, String name, int age, Address address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int getSsn() {
		return ssn;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Address getAddress() {
		return address;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	public void destroyPerson() {
		System.out.println("Destroy Person Method");
	}
	
	public void inItPerson() {
		System.out.println("Init Person Method");
	}
}
