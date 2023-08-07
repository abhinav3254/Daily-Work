package com.sir8august.onetoone;

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
		
		Transaction transaction = session.beginTransaction();
		
		Book book = new Book(10,"C++","$13.02");
		Book book2 = new Book(20,"Java","$55.10");
		
		List<Book> listBook = new ArrayList<Book>();
		listBook.add(book);
		listBook.add(book2);
		
		Library library = new Library(102,"lib1",listBook);
		
		session.save(library);
		
		transaction.commit();
		
		
	}
}
