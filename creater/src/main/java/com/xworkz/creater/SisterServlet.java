package com.xworkz.creater;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 9,urlPatterns = "/call")

public class SisterServlet extends HttpServlet {

	public SisterServlet() {
		System.out.println("Creating SisterServlet......");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running SisterServlet.....");
	}
}
