package com.example.abhinav;
public class Person {
	
	private int ssn;
	private String name;
	private int age;
	private String gender;
	private String city;
	
	public Person() {}
	
	public Person (int ssn,String name,int age,String gender,String city) {
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.city = city;
	}
	
	public void setSsn (int ssn) {
		this.ssn = ssn;
	}
	public int getSsn () {
		return ssn;
	}
	
	public String getName () {
		return name;
	}
	
	public int getAge () {
		return age;
	}
	
	public String getGender () {
		return gender;
	}
	public String getCity () {
		return city;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public void setGender (String gender) {
		this.gender = gender;
	}
	
	public void setCity (String city) {
		this.city = city;
	}
}