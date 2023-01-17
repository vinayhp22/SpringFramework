package com.petrolbunk.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.petrolbunk")
public class PetrolConfiguration {
	public PetrolConfiguration() {
		System.out.println("Created PetrolConfiguration");
	}
}
