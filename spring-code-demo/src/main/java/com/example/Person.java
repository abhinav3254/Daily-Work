package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private int ssn = 12;
	private String name = "Abhinav Jha";
	private int age = 22;
	@Autowired
//	@Qualifier("add")
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
}
