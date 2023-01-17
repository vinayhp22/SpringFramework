package com.petrolbunk.boot;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.petrolbunk.bean.PetrolBunk;
import com.petrolbunk.configuration.PetrolConfiguration;

public class PetrolRunner {
	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(PetrolConfiguration.class);
		PetrolBunk bunk = container.getBean(PetrolBunk.class);
		bunk.purchase();

		System.out.println(
				"\n" + Arrays.toString(container.getBeanDefinitionNames()) + "\n" + container.getBeanDefinitionCount());
	}
}
