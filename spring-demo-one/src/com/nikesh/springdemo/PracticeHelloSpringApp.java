package com.nikesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myGolfCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getdDailyWorkout());
		
		System.out.println(theCoach.getdDailyFortune());
		
		
		//close the context
		context.close();
	}

}
