package com.xworkz.browser.bean;

import org.springframework.stereotype.Component;
import com.xworkz.browser.rules.Provider;

@Component
public class Jio implements Provider {
	public Jio() {
		System.out.println("Default const of Jio");
	}

	@Override
	public void connect() {
		System.out.println("connect in Jio..");
	}
}
