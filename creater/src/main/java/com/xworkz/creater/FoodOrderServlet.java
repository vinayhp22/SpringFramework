package com.xworkz.creater;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 6,urlPatterns = "/food")
public class FoodOrderServlet extends HttpServlet {
 
	public FoodOrderServlet() {
		System.out.println("Creating FoodOderServlet.....");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running FoodOderServlet.....");
	}
}
