package com.example.util;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateUtil {
	//private static org.hibernate.SessionFactory sessionFactory;
	public static SessionFactory buildSessionFactory() {
//		try {
//			if (sessionFactory == null) {
//				StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
//						.configure("hibernate.cfg.xml").build();
//				
//				Metadata metadata = new  MetadataSources(standardServiceRegistry)
//						.getMetadataBuilder()
//						.build();
//				
//				sessionFactory  = metadata.getSessionFactoryBuilder().build();
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	       Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	       SessionFactory sessionFactory = meta.getSessionFactoryBuilder().build();
	       return sessionFactory;
	}
	
//	public static SessionFactory getSessionFactory() {
//		SessionFactory sessionFactory;
//		return sessionFactory;
//	}
	
}
