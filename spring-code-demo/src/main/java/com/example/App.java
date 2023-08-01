package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
        Wish wish = container.getBean("wish1",Wish.class);
        System.out.println(wish.getMessage());
        container.close();
    }
}
