package com.luv2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class use {
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from bean container
        Coach theCoach=context.getBean("Coach", Coach.class);


        //Calling the method
        System.out.println(theCoach.getDailyWorkout());
    }
}
