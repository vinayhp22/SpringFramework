package com.xworkz.movies.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.movies")
public class MovieConfiguaration {
	public MovieConfiguaration() {
		System.out.println("MovieConfiguaration Created.....");
	}
}
