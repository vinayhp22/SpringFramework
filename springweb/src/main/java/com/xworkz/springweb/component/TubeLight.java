package com.xworkz.springweb.component;

import org.springframework.stereotype.Component;

@Component
public class TubeLight {
	public TubeLight() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
