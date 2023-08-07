package com.sir8august.query.demo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

public class Main {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		/*
		Query query = session.createQuery("FROM  hourlywagesemployee");
		List<HourlyWagesEmployee> list = query.list();
		System.out.println(list);
		
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getEmp_id()+" "+list.get(i).getEmp_name()+" "+list.get(i).getNoOfHours()+" "+list.get(i).getRatePerHour());
		}
		
		
		Address address = new Address(101,"24/25 main road","Darbhanga","Bihar","India","846001");
		Address address1 = new Address(102,"sector-2","Mothihari","Bihar","India","81078");
		Address address2 = new Address(103,"main road rahamganj chowk","Muzzafarpur","Bihar","India","846010");
		Address address3 = new Address(104,"tower chowk sector 55","Patna","Bihar","India","846053");
		
		session.save(address);
		session.save(address1);
		session.save(address2);
		session.save(address3);
		
		
		
		Query query = session.createQuery("from address");
		
		List<Address> list = session.createQuery("from address").list();
		
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i).getId()+" "+list.get(i).getHouseNumber()+"  "+list.get(i).getCity()+"  "+list.get(i).getState()+"  "+list.get(i).getCountry()+"  "+list.get(i).getZipCode());
		}
		*/
		
		Criteria criteria = session.createCriteria(Address.class);
		criteria.addOrder(Order.asc("zipCode"));
		List<Address> list = criteria.list();
		for (Address a : list) {
			System.out.println(a.getId()+" "+a.getCity()+" "+a.getZipCode());
		}
		
		
		session.close();
	}
}
