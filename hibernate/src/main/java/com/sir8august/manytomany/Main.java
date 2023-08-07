package com.sir8august.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Student ramesh = new Student();
		Student rajesh = new Student();
		/*
		ramesh.setsId(3);
		ramesh.setStudentName("Naman");
		ramesh.setPhone("+91 12345");
		ramesh.setStudentAddress("Bhopal");
		rajesh.setsId(4);
		rajesh.setStudentName("Adarsh");
		rajesh.setPhone("+19 12345");
		rajesh.setStudentAddress("Indore");
		
		List<Student> listStudent = new ArrayList<>();
		List<Course> listCourse = new ArrayList<>();
		
		listStudent.add(rajesh);
		listStudent.add(ramesh);
		
		Course java = new Course();
		java.setcId(103);
		java.setCourseName("Learn C#");
		java.setDuration("6 months");
		java.setFaculty("Rahul");
		
		Course python = new Course();
		python.setcId(104);
		python.setCourseName("Learn perl");
		python.setDuration("2 months");
		python.setFaculty("Harsh");
	
		
		listCourse.add(java);
		listCourse.add(python);
		
		rajesh.setCoList(listCourse);
		ramesh.setCoList(listCourse);
		
		java.setStList(listStudent);
		python.setStList(listStudent);
		
		session.save(python);
		session.save(java);
		session.save(rajesh);
		session.save(ramesh);
		*/
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		
	}
}
