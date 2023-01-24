package com.xworkz.httpservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/xworkz")
public class ButterChickenServlet extends HttpServlet {
	public ButterChickenServlet() {
		System.out.println("running ButterChickenServlet");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Delete from ButterChicken");
		String data = "displaying data as Delete";
		resp.getWriter().print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get from ButterChicken");
		String data = "displaying data as Get";
		resp.getWriter().print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Head from ButterChicken");
		String data = "displaying data as Head";
		resp.getWriter().print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Options from ButterChicken");
		String data = "displaying data as Options";
		resp.getWriter().print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post from ButterChicken");
		String data = "displaying data as Post";
		resp.getWriter().print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Put from ButterChicken");
		String data = "displaying data as Put";
		resp.getWriter().print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Trace from ButterChicken");
		String data = "displaying data as Trace";
		resp.getWriter().print(data);
		resp.setContentType("text/plain");
	}

}
