package com.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
		AadharCard aCard = container.getBean(AadharCard.class);
		System.out.println(aCard);
	}
}
