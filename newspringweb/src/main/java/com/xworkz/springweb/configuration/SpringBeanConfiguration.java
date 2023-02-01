package com.xworkz.springweb.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springweb")
public class SpringBeanConfiguration {
	public SpringBeanConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
