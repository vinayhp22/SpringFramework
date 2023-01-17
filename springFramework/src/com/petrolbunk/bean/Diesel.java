package com.petrolbunk.bean;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel{

	public Diesel() {
		System.out.println("Created Diesel...");
	}
	@Override
	public void consume() {
		System.out.println("consume in Diesel");
	}

}
