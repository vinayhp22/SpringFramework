package com.xworkz.browser.bean;

import org.springframework.stereotype.Component;
import com.xworkz.browser.rules.Provider;

@Component
public class Airtel implements Provider {
	public Airtel() {
		System.out.println("Default const of Airtel");
	}

	@Override
	public void connect() {
		System.out.println("connect in Aietel..");
	}

}
