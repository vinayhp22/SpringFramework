package com.xworkz.bakery.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bakery")
public class VinayConfiguration {
	public VinayConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
}
