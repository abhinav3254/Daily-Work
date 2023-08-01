package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class Citizen {
	private String name = "Jogesh Kumar";
	private int age = 55;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Citizen(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", age=" + age + "]";
	}
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
}
