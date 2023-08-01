package com.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext conatiner = new AnnotationConfigApplicationContext(Config.class);
		Person p = conatiner.getBean(Person.class);
		System.out.println(p);
	}
}
