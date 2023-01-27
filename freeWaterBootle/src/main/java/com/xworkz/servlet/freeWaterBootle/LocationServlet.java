package com.xworkz.servlet.freeWaterBootle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 103, urlPatterns = "/location")
public class LocationServlet extends HttpServlet {
	public LocationServlet() {
		System.out.println("Running LocationServlet....");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init config...LocationServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost request in  LocationServlet");

		String name = req.getParameter("locationName");
		String email = req.getParameter("locationEmail");
		String startPoint = req.getParameter("startPoint");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");
		
		PrintWriter writer = resp.getWriter();
		if(name.length()>3 && startPoint.length()>3 && destination.length()>3) {
			writer.print("Location saved Successfully.." + name + " " + email + " " + startPoint + " "+destination+" "+gender);
		}else if (name.length() <= 3) {
			writer.print("Failed!! Name is invalid");
		}else if (startPoint.length()<=3) {
			writer.print("Failed!! startPoint is invalid");
		}else if (destination.length()<=3) {
			writer.print("Failed!! destination is invalid");
		}

	}

	@Override
	public void destroy() {
		System.out.println("destroy LocationServlet");
	}
}
