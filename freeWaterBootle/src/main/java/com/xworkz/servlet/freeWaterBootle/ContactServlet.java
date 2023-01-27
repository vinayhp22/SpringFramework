package com.xworkz.servlet.freeWaterBootle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 103, urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {
	public ContactServlet() {
		System.out.println("ContactServlet ... default const..");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init ..... config....");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet in ContactServlet");

		String name = req.getParameter("contactName");
		String email = req.getParameter("contactEmail");
		String mobile = req.getParameter("contactMobile");
		String comments = req.getParameter("comments");
		Long convMobile = Long.parseLong(mobile);
		
		PrintWriter writer = resp.getWriter();

		if (name.length() > 3 && convMobile.SIZE == 10) {
			writer.print("Contact details saved : successful");
		}else if (name.length() <= 3) {
			writer.print("Failed!! Name is invalid");
		}else if (convMobile.SIZE!=10) {
			writer.print("Failed!! Mobile number is invalid");
		}
	}

	@Override
	public void destroy() {
		System.out.println("destroy... config..ContactServlet");
	}
}
