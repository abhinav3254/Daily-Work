package com.august8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Student studentRam = new Student(1,"Laxman");
		
		session.delete(studentRam);
		
		Transaction transaction = session.beginTransaction();
		
		
//		Student student = (Student) session.get(Student.class, 1);
//		
//		System.out.println(student);
		
		transaction.commit();
		
		session.close();
	}
}
