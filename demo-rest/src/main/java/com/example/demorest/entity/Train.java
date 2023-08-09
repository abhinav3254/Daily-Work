package com.example.demorest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="train")
public class Train {
	@Id
	@Column(name="train_number")
	private int trainId;
	@Column(name="train_name")
	private String trainName;
	@Column(name="train_src")
	private String src;
	@Column(name="train_dest")
	private String dest;
	@Column(name="compartments")
	private int compartment;
	@Column(name="fare")
	private double fare;
	public Train(int trainId, String trainName, String src, String dest, int compartment, double fare) {
		super();
		this.trainId = trainId;
		this.trainName = trainName;
		this.src = src;
		this.dest = dest;
		this.compartment = compartment;
		this.fare = fare;
	}
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTrainId() {
		return trainId;
	}
	public String getTrainName() {
		return trainName;
	}
	public String getSrc() {
		return src;
	}
	public String getDest() {
		return dest;
	}
	public int getCompartment() {
		return compartment;
	}
	public double getFare() {
		return fare;
	}
	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public void setCompartment(int compartment) {
		this.compartment = compartment;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "Train [trainId=" + trainId + ", trainName=" + trainName + ", src=" + src + ", dest=" + dest
				+ ", compartment=" + compartment + ", fare=" + fare + "]";
	}	
}
