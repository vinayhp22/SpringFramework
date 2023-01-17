package com.xworkz.browser.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.xworkz.browser.rules.Browser;
import com.xworkz.browser.rules.Provider;

@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("airtel")
	private Provider provider;

	public Chrome() {
		System.out.println("Default const of chrome");
	}

	@Override
	public void browse() {
		System.out.println("browse in Chrome..");
		provider.connect();
	}

}
