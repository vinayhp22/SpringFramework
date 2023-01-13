package com.xworkz.movies.components;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	private Director director;
	private CameraMan cameraMan;

	public Movie() {
		System.out.println("Movie created...");
	}
}
