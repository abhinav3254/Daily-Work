package com.sir8august.second_half;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name="hourlywagesemployee")
//@DiscriminatorValue("Hourly Wages")
public class HourlyWagesEmployee extends Employee {
	@Column(name="no_hour")
	private int noOfHours;
	@Column(name="rate_hour")
	private double ratePerHour;
	
	public HourlyWagesEmployee() {}
	
	public HourlyWagesEmployee(int emp_id,String emp_name,int no_hours,double ratePerHour) {
		super(emp_id,emp_name);
		this.noOfHours = no_hours;
		this.ratePerHour = ratePerHour;
	}

	public int getNoOfHours() {
		return noOfHours;
	}

	public double getRatePerHour() {
		return ratePerHour;
	}

	public void setNoOfHours(int noOfHours) {this.noOfHours = noOfHours;}

	public void setRatePerHour(double ratePerHour) {this.ratePerHour = ratePerHour;}

	@Override
	public String toString() {
		return "HourlyWagesEmployee [noOfHours=" + noOfHours + ", ratePerHour=" + ratePerHour + "]";
	}
	
	
	
}
