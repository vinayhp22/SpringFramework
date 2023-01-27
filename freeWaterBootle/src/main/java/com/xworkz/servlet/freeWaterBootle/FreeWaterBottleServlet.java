package com.xworkz.servlet.freeWaterBootle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 101, urlPatterns = "/free")
public class FreeWaterBottleServlet extends HttpServlet {
	public FreeWaterBottleServlet() {
		System.out.println("Running FreeWaterBottleServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init method in FreeWaterBottleServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method in FreeWaterBottleServlet");

		String name = req.getParameter("userName");
		String email = req.getParameter("userEmail");
		String password = req.getParameter("userPassword");
		String confirmP = req.getParameter("confirmPassword");

		PrintWriter writer = resp.getWriter();
		writer.print("Successful FreeWaterBottleServlet : " + name+"  " + email +" "+ password +" "+ confirmP);
	}

	@Override
	public void destroy() {
		System.out.println("destroy method in FreeWaterBottleServlet");
	}
}
