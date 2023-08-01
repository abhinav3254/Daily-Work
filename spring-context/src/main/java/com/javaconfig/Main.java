package com.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext conatiner = new AnnotationConfigApplicationContext(Config.class);
		AadharCard aCard = conatiner.getBean(AadharCard.class);
		System.out.println(aCard);
	}
}
