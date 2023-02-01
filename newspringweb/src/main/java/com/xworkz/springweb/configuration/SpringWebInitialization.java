package com.xworkz.springweb.configuration;

import java.util.Arrays;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitialization 
extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer {

	public SpringWebInitialization() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses");
		Class[] configClass = { SpringBeanConfiguration.class };
		System.out.println("Config class " + Arrays.toString(configClass));
		return configClass;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		Class[] configClass = { SpringBeanConfiguration.class };
		System.out.println("Config class " + Arrays.toString(configClass));
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings");
		String[] stringArray = { "/" };
		System.out.println("getServletMappings " + Arrays.toString(stringArray));
		return stringArray;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("runnging configureDefaultServletHandling");
		configurer.enable();
	}

}
