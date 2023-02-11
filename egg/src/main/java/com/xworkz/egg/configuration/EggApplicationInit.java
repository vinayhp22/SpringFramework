package com.xworkz.egg.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class EggApplicationInit extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	
	public EggApplicationInit() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");
		return new Class[] {EggApplicationConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("configureDefaultServletHandling");
		configurer.enable();
	}
	
}
