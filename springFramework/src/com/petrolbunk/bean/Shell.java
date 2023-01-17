package com.petrolbunk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk {

	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;
	
	public Shell() {
		System.out.println("Created Shell..");
	}
	@Override
	public void purchase() {
		System.out.println("Running purchase in shell..");
		fuel.consume();
	}
	
}
