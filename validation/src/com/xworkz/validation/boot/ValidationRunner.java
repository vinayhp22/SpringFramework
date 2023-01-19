package com.xworkz.validation.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.validation.configuration.ValidationConfiguration;
import com.xworkz.validation.dto.FirstAidDTO;
import com.xworkz.validation.dto.MissileDTO;
import com.xworkz.validation.dto.ResortDTO;
import com.xworkz.validation.service.FirstAidService;
import com.xworkz.validation.service.MissileService;
import com.xworkz.validation.service.ResortService;

public class ValidationRunner {
	public static void main(String[] args) {
		System.out.println("Main started...");
		ApplicationContext container = new AnnotationConfigApplicationContext(ValidationConfiguration.class);
		System.out.println(container.getBean(FirstAidService.class).validateAndSave(new FirstAidDTO()));

		System.out.println("\n=================================================================\n");

		System.out.println(container.getBean(MissileService.class).validateAndSave(new MissileDTO()));

		System.out.println("\n=================================================================\n");

		System.out.println(container.getBean(ResortService.class).validateAndSave(new ResortDTO()));
	}
}
