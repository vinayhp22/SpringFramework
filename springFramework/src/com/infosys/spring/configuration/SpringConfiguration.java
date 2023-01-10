package com.infosys.spring.configuration;

import java.time.Month;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.infosys.spring.components.Actor;
import com.infosys.spring.components.Rocket;
import com.infosys.spring.components.Season;

@Configuration
@ComponentScan("com.infosys.spring")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("Created SpringConfiguration....");
	}
	
	@Bean("gslv")
	public Rocket rocket() {
		System.out.println("rocket in config");
		Rocket rocket = new Rocket("+91", "GSLV", 1265415263);
		System.out.println(rocket.toString());
		return rocket;
	}
	
	@Bean("rainy")
	public Season season() {
		System.out.println("season in config");
		Season season = new Season("rainy", 5, Month.MARCH);
		return season;
	}
	
	@Bean("darshan")
	public Actor actor() {
		System.out.println("actor in congig");
		Actor actor = new Actor();
		actor.setName("Darshan");
		actor.setLanguage("Kannada");
		actor.setAge(50);
		return actor;
	}
}
