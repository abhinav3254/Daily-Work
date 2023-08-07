package com.sir8august.second_half;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name="salariedemployee")
//@DiscriminatorValue("Salaried")
public class SalariedEmployee extends Employee {
	@Column(name="emp_sal")
	private double salary;
	
	public SalariedEmployee() {}
	
	public SalariedEmployee(int emp_id,String emp_name,double salary) {
		super(emp_id,emp_name);
		this.salary = salary;
	}
	
	public void setSalary(double salary) {this.salary = salary;}
	public double getSalary() {return this.salary;}
}
