package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "emp_name")
	private String employeeName;
	
	@Column(name = "salary")
	private Double salary;
	
	@Column(name = "dept_nu")
	private Integer departmentNumber;

	public Integer getId() {
		return id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Double getSalary() {
		return salary;
	}

	public Integer getDepartmentNumber() {
		return departmentNumber;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setDepartmentNumber(Integer departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	
	
}
