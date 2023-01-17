package com.xworkz.browser.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.xworkz.browser.rules.Browser;
import com.xworkz.browser.rules.Provider;

@Component
public class FireBox implements Browser {
	@Autowired
	@Qualifier("jio")
	private Provider provider;
	
	public FireBox() {
		System.out.println("Default const of Firebox");
	}

	@Override
	public void browse() {
		System.out.println("browse in FireBox..");
		provider.connect();
	}

}
