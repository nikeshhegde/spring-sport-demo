package com.nikesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods of the bean
		System.out.println(theCoach.getdDailyWorkout());
		
		//call new method for fortune
		System.out.println(theCoach.getdDailyFortune());
		
		//close the context
		context.close(); 
	}

}
