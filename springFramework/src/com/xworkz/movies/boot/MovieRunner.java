package com.xworkz.movies.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.movies.configuration.MovieConfiguaration;

public class MovieRunner {
public static void main(String[] args) {
	ApplicationContext container = new AnnotationConfigApplicationContext(MovieConfiguaration.class);
	System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
	
	System.out.println(container.getBeanDefinitionCount());
}
}
