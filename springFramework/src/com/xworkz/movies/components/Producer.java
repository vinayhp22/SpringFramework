package com.xworkz.movies.components;

import org.springframework.stereotype.Component;

@Component
public class Producer {

	private Assistant assistant;
	private Company company;
	
	public Producer() {
		System.out.println("Producer created...");
	}
}
