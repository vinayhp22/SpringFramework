package com.xorkz.vinayhp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xorkz.vinayhp")
public class VinayConfiguration {
	public VinayConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
