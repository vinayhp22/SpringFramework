package com.petrolbunk.bean;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel {
	

	public Petrol() {
		System.out.println("Created Petrol...");
	}

	@Override
	public void consume() {
		System.out.println("consume in Petrol");

	}
}
