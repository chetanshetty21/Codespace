package com.xworkz.network.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/apple")
public class WaterbottelServlets extends HttpServlet{
	public WaterbottelServlets() {
		System.out.println("water bottel running in to sever"+getClass().getSimpleName());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("creating waterbottle inn server");
	}

}
