package com.example.abhinav;

import com.example.abhinav.Person;

public class Student extends Person{
	
	private int studentId;
	private int classStudy;
	
	public Student() {
		super();
	}
	
	public Student (String name,int age,String gender,String city,int studentId , int classStudy) {
		super(name,age,gender,city);
		this.studentId = studentId;
		this.classStudy = classStudy;
	}
	
}