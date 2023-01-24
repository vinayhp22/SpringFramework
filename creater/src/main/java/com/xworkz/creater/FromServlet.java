package com.xworkz.creater;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 7,urlPatterns = "/register")

public class FromServlet extends HttpServlet {

	public FromServlet() {
		System.out.println("Creating Form.....");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running FormServlet");
	}
}
