package com.xworkz.creater;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/boat")

public class BoatServlet extends HttpServlet {
 
	public BoatServlet() {
		System.out.println("Creaing BoatServlet....");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running BoatServlet.......on web page.....");
	}
}
