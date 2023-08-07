package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int ssn;
	private String presonName;
	private int age;
	private String gender;
	
	@OneToOne
	@JoinColumn
	Address address;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int ssn, String presonName, int age, String gender, Address address) {
		super();
		this.ssn = ssn;
		this.presonName = presonName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public int getSsn() {
		return ssn;
	}

	public String getPresonName() {
		return presonName;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public void setPresonName(String presonName) {
		this.presonName = presonName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", presonName=" + presonName + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + "]";
	}
}
