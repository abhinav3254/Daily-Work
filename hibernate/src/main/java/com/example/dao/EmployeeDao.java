package com.example.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.example.entity.Employee;

public class EmployeeDao {
	SessionFactory sessionFactory = null;
	public EmployeeDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void insertEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		try {
			session.save(employee);
			transaction.commit();
		}catch(Exception e) {System.out.println(e);
		transaction.rollback();}
	}
	
	public void deleteEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		try {
			session.delete(employee);
			transaction.commit();
		} catch(Exception e) {System.out.println(e);
		transaction.rollback();}
	}
	
	public void modifyEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		try {
			session.update(employee);
			transaction.commit();
		} catch(Exception e) {System.out.println(e);
		transaction.rollback();}
	}
	
	public Employee getEmployee(int employeeId) {
		Session session = sessionFactory.openSession();
		return session.get(Employee.class, employeeId);
	}
}
