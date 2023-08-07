package com.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.dao.EmployeeDao;
import com.example.entity.Address;
import com.example.entity.Employee;
import com.example.entity.Person;
import com.example.util.HibernateUtil;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hibernate Tutorial" );
        
        SessionFactory factory = HibernateUtil.buildSessionFactory();
        
        /*Session session = factory.openSession();
        
//        Employee employeeAshok = new Employee(105,"Aman",21000,202);
        Employee employeeAalia = new Employee(105,"Aalia",1800,202);
        
        Transaction transaction = session.beginTransaction();
//        Employee employee = session.get(Employee.class,102);
//        employee.setEmployeeName("Raman");
//        session.update(employee);
//        session.saveOrUpdate(employeeAalia);
        session.delete(employeeAalia);
        transaction.commit();
        
        session.close();
        factory.close();
        */
        /*
        EmployeeDao employeeDao = new EmployeeDao(factory);
        employeeDao.insertEmployee(new Employee(112,"Ruchika",2000,20));
        Employee employee = employeeDao.getEmployee(110);
        if (employee!=null) System.out.println(employee);
        else System.out.println("User Not Found");
        employeeDao.modifyEmployee(new Employee(101,"Ashok Verma",5500,212));
        employeeDao.deleteEmployee(new Employee(103,"",0,0));
        */
        Session session = factory.openSession();
        //Address addressPatna= new Address(2,"12/13","kankar bhagh road","Patna","Bihar");
        //Person person = new Person(112,"Rahul",20,"male",addressPatna);
        
        
        Transaction transaction = session.beginTransaction();
//        session.save(addressPatna);
//        session.save(person);
        //Person p = session.get(Person.class, person);
        
        //System.out.println(p.getPresonName()+"  "+p.getAddress().getStateName());
        
        transaction.commit();
        session.close();
        factory.close();
    }
}
