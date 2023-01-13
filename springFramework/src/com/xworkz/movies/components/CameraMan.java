package com.xworkz.movies.components;

import org.springframework.stereotype.Component;

@Component
public class CameraMan {

	private Camera camera;

	public CameraMan() {
		System.out.println("CameraMan Created...");
	}
}
