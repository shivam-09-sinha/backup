package com.luv2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from bean container
        Coach theCoach=context.getBean("Coach", Coach.class);
        Coach alphaCoach=context.getBean("Coach", Coach.class);

        //check is these are same
        boolean result=(theCoach==alphaCoach);

        //print the results

        System.out.println("same object: "+ result);

        System.out.println("memory address for the coach: "+ theCoach);
        System.out.println("memory address for the alphacoach: "+ alphaCoach);


        //Calling the method
//        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();



    }
}
