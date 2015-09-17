package com.bank.manager.training;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SayHelloAdvisor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("*****SAY HELLO ADVISOR******");
		if((arg0.getArguments()[0] instanceof Entity) && 
				((Entity)arg0.getArguments()[0]).getName().equals("TEST"))
			throw new RuntimeException("IT IS A TEST SO WE WILL CANCEL");
		if(arg0.getArguments()[0] instanceof Long && 
				!DB.entities.containsKey(arg0.getArguments()[0]))
			throw new RuntimeException("TRYING TO GATHER A UNKNOWN USER");
		arg0.proceed();
		System.out.println("*****SAY HELLO ADVISOR******");
		return null;
	}
	

}
