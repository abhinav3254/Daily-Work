package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
//		Wish wish = container.getBean("wish1",Wish.class);
//		System.out.println("Wish :- "+wish.getMessage());
		
		
//		Wish wish2 = container.getBean("wish1",Wish.class);
		
//		wish2.setMessage("Spring Welcomes You");
		
//		System.out.println("Wish :- "+wish.getMessage());
//		System.out.println("Wish2 :- "+wish2.getMessage());
		
		Person person = container.getBean("person1",Person.class);
		System.out.println(person);
		
		container.close();
	}
}
