package com.sir8august.second_half;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		//Configuration configuration = new Configuration().configure();
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		SalariedEmployee salariedEmployee = new SalariedEmployee(103,"Mohan",20000);
		HourlyWagesEmployee hourlyWagesEmployee = new HourlyWagesEmployee(104,"Rahul",45,5000);
		session.save(hourlyWagesEmployee);
		session.save(salariedEmployee);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
		factory.close();
	}
}
