package com.example.abhinav;

import com.example.abhinav.Person;

public class Student extends Person{
	
	
	// Admission number, class , roll number , house, studentId
	private int admissionNumber;
	private String house;
	private int rollNumber; 
	private int studentId;
	private int classStudy;
	private int studentId;
	
	public Student() {
		super();
	}
	
	public Student (String name,int age,String gender,String city,int studentId , int classStudy) {
		super(name,age,gender,city);
		this.studentId = studentId;
		this.classStudy = classStudy;
	}
	
}