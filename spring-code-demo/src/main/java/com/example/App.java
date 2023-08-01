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
//        Wish wish = container.getBean("wish1",Wish.class);
//        System.out.println(wish.getMessage());
        Person person = container.getBean("person",Person.class);
        System.out.println("person values are :- "+person);
        
//        Country country = container.getBean("ctry",Country.class);
//        System.out.println(country);
//        
//        for(Entry<String, String> e: country.getStates().entrySet())
//        	System.out.println(e.getKey()+"    "+e.getValue());
        
        container.close();
    }
}
