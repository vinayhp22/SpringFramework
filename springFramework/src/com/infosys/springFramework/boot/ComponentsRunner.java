package com.infosys.springFramework.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.infosys.springFramework.configuration.VinayConfiguration;

public class ComponentsRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(VinayConfiguration.class);
		String[] beanNames = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));

		System.out.println("\nList"+context.getBean(ArrayList.class));
		
		System.out.println("\nMap : "+context.getBean("map",Map.class));
		
		
		String ref = context.getBean("home",String.class);
		System.out.println("\n"+ref);
		
		String ref1 = context.getBean("tv",String.class);
		System.out.println("\n"+ref1);
		
		String ref2 = context.getBean("psycho",String.class);
		System.out.println("\n"+ref2);
		
		String ref3 = context.getBean("layman",String.class);
		System.out.println("\n"+ref3);
		
		String ref4= context.getBean("map1",String.class);
		System.out.println("\n"+ref4);
		
		Boolean booleanFam1 = context.getBean("clock", Boolean.class);
		System.out.println("\nClock: "+booleanFam1);
		
		Boolean booleanFam2 = context.getBean("midnight", Boolean.class);
		System.out.println("\nMidnight: "+booleanFam2);
		
		Boolean booleanFam3 = context.getBean("island", Boolean.class);
		System.out.println("\nIsland: "+booleanFam3);
		
		Boolean booleanFam4 = context.getBean("oxford", Boolean.class);
		System.out.println("\nOxford: "+booleanFam4);
		
		Boolean booleanFam5 = context.getBean("student", Boolean.class);
		System.out.println("\nStudent: "+booleanFam5);
		
		
	}

}
