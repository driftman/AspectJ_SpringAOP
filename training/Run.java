package com.bank.manager.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"classpath*:training-context.xml"});
		IManagerTrainingMetier metier = (IManagerTrainingMetier)
				context.getBean("metierProxied");
		metier.sayHello2(1L);
	}

}
