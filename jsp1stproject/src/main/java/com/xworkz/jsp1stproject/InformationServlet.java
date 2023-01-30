package com.xworkz.jsp1stproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(loadOnStartup = 3,urlPatterns = "/sahana")
public class InformationServlet extends HttpServlet {

	public InformationServlet() {
		System.out.println("InformationServlet Running");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String gender = req.getParameter("gender");
		String reason = req.getParameter("reason");
		String address = req.getParameter("address");

	//resp.getWriter().print(fname + lname + gender + reason + address);

		RequestDispatcher dispatcher = req.getRequestDispatcher("DisplayInfo.jsp");

		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("gender", gender);
		req.setAttribute("reason", reason);
		req.setAttribute("address", address);
		dispatcher.forward(req, resp);
	}

}
