package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach=context.getBean("coach",BasketballCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
