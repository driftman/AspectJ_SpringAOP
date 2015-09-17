package com.bank.manager.training;

import java.util.HashMap;

public class DB {

	
	public static HashMap<Long, Entity>  entities = new HashMap<Long, Entity>(){{
			put(1L, new Entity(1L, "Soufiane ELBAZ"));
			put(2L, new Entity(2L, "John DOE"));
		}};
	
}
