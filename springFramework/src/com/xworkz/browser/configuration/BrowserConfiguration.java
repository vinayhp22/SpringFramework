package com.xworkz.browser.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.browser")
public class BrowserConfiguration {
public BrowserConfiguration() {
	System.out.println("Default const of BrowserConfiguration");
}
}
