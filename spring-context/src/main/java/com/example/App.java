package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("Config.xml");
        AadharCard aCard = container.getBean("aad",AadharCard.class);
        System.out.println(aCard);
    }
}
