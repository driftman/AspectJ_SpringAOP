package com.bank.manager.training;



public class IManagerTrainingDaoImpl implements IManagerTrainingDao{
	

	@Override
	public void sayHello1(Entity person) {
		// TODO Auto-generated method stub
		System.out.println(person.getName());
		
	}

	@Override
	public void sayHello2(Long id_person) {
		// TODO Auto-generated method stub
		System.out.println(DB.entities.get(id_person).getName());
		
	}
	
}
