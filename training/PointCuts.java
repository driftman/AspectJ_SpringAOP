package com.bank.manager.training;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;



@Aspect
public class PointCuts {

	@Pointcut("execution(* com.bank.manager.training.IManagerTrainingMetierImpl.sayHello*(..))")
	public void allSayHelloMethods(){};
	
	@Pointcut("execution(* com.bank.manager.training.IManagerTrainingMetierImpl.sayHello1(..))")
	public void sayHello1Method(){};
	
	@Pointcut("execution(* com.bank.manager.training.IManagerTrainingMetierImpl.sayHello2(..))")
	public void sayHello2Method(){};
}
