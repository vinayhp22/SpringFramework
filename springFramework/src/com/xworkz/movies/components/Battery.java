package com.xworkz.movies.components;

import org.springframework.stereotype.Component;

@Component
public class Battery {
	private Capacity capacity;

	public Battery() {
		System.out.println("Battery created...");
	}
}
