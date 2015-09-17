package com.bank.manager.training;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;

public class MetierAdvisor implements MethodInterceptor{

	@Autowired
	private IManagerTrainingMetier metier;
	
	public void setMetier(IManagerTrainingMetier metier)
	{
		this.metier = metier;
	}
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("*****METIER PROXY ADVISOR******");
		arg0.proceed();
		System.out.println("*****METIER PROXY ADVISOR******");
		return null;
		
	}

}
