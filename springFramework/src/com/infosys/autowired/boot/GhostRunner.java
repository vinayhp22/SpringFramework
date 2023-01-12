package com.infosys.autowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infosys.autowired.components.ghost.Engine;
import com.infosys.autowired.components.ghost.Ghost;
import com.infosys.autowired.components.ghost.NewsPaper;
import com.infosys.autowired.components.ghost.Snake;
import com.infosys.autowired.configuration.GhostConfiguration;

public class GhostRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(GhostConfiguration.class);

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println("\nBeans Count : " + container.getBeanDefinitionCount());

		System.out.println("==============================================\n");

		NewsPaper paper = container.getBean(NewsPaper.class);
		System.out.println(paper.toString());
		System.out.println("==============================================\n");

		System.out.println(container.getBean(Engine.class).toString());
		System.out.println("==============================================\n");

		System.out.println(container.getBean(Snake.class).toString());
		System.out.println("==============================================\n");

		System.out.println(container.getBean(Ghost.class).toString());
		System.out.println("==============================================\n");

	}
}
