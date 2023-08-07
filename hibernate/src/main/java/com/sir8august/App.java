package com.sir8august;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.example.entity.Employee;

public class App {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
//		Address address = new Address(101,"Darbhanga");
//		Employee employee = new Employee(1,"Abhinav",address);
		
		Transaction transaction = session.beginTransaction();
		
//		session.save(address);
//		session.save(employee);
		
		Employee employee = session.get(Employee.class, 1);
		System.out.println(employee);
		
		transaction.commit();
		
	}
}
