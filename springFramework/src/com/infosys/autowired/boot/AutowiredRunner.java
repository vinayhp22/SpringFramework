package com.infosys.autowired.boot;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.infosys.autowired.components.Country;
import com.infosys.autowired.components.HardwareShop;
import com.infosys.autowired.components.Pencil;
import com.infosys.autowired.components.Rubber;
import com.infosys.autowired.components.Software;
import com.infosys.autowired.components.SoftwareEnginner;
import com.infosys.autowired.configuration.AutowiredCinfiguration;

public class AutowiredRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(AutowiredCinfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		HardwareShop shop = container.getBean(HardwareShop.class);
		System.out.println(System.lineSeparator() + shop.toString());

		System.out.println("\n==========================================\n");

		Software software = container.getBean(Software.class);
		System.out.println(software.toString());

		System.out.println("\n==========================================\n");

		SoftwareEnginner enginner = container.getBean(SoftwareEnginner.class);
		System.out.println(enginner.toString());

		System.out.println("\n==========================================\n");

		Pencil pencil = container.getBean(Pencil.class);
		System.out.println(pencil.toString());

		System.out.println("\n==========================================\n");

		Rubber rubber = container.getBean(Rubber.class);
		System.out.println(rubber.toString());

		System.out.println("\n==========================================\n");

		Country country = container.getBean(Country.class);
		System.out.println(country.toString());

	}
}
