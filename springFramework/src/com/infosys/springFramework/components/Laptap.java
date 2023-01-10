package com.infosys.springFramework.components;

import org.springframework.stereotype.Component;

@Component("dell")
public class Laptap {
	public Laptap() {
		System.out.println("Laptop in springframework");
	}

	private void power() {
		System.out.println("power in the laptop component");
	}
}
