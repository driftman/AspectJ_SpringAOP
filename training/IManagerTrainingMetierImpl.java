package com.bank.manager.training;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.manager.beans.Account;
import com.bank.manager.beans.Adresse;
import com.bank.manager.beans.Client;
import com.bank.manager.beans.Compte;
import com.bank.manager.beans.Coordonnee;
import com.bank.manager.beans.Employee;
import com.bank.manager.beans.Operation;
import com.bank.manager.beans.Situation;
import com.bank.manager.beans.Tache;
import com.bank.manager.metier.IManagerMetier;

public class IManagerTrainingMetierImpl implements IManagerTrainingMetier {

	@Autowired
	private IManagerTrainingDao dao;
	
	public void setDao(IManagerTrainingDao dao)
	{
		this.dao = dao;
	}

	@Override
	public void sayHello1(Entity person) {
		// TODO Auto-generated method stub
		dao.sayHello1(person);
	}

	@Override
	public void sayHello2(Long id_person) {
		// TODO Auto-generated method stub
		dao.sayHello2(id_person);
		System.out.println("2");
	}
	
	

}
