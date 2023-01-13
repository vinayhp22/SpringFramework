package com.xworkz.movies.components;

import org.springframework.stereotype.Component;

@Component
public class Director {

	private Producer producer;
	private Experience experience;

	public Director() {
		System.out.println("Director created....");
	}
}
