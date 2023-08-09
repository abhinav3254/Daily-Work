package com.example.demorest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="passengers")
public class Passengers {
	@Id
	@Column(name="pass_id")
	private int passengerId;
	@Column(name="pass_name")
	private String name;
	@Column(name="pass_mobile")
	private long number;
	@Column(name="pass_age")
	private int age;
	@Column(name="train_number")
	private int trainNumber;
	
	transient private Train train;
	
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	public Passengers() {}
	public Passengers(int passengerId, String name, long number, int age, int trainNumber) {
		this.passengerId = passengerId;
		this.name = name;
		this.number = number;
		this.age = age;
		this.trainNumber = trainNumber;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public String getName() {
		return name;
	}
	public long getNumber() {
		return number;
	}
	public int getAge() {
		return age;
	}
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	@Override
	public String toString() {
		return "Passengers [passengerId=" + passengerId + ", name=" + name + ", number=" + number + ", age=" + age
				+ ", trainNumber=" + trainNumber + "]";
	}	
}
