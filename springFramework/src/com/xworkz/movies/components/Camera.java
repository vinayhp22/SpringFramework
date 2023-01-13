package com.xworkz.movies.components;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	private Lens lens;
	private Battery battery;

	public Camera() {
		System.out.println("Camera created...");
	}
}
