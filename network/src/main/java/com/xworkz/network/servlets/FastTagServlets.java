package com.xworkz.network.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 01,urlPatterns = "/mango")
public class FastTagServlets extends HttpServlet{
	public FastTagServlets() {
		System.out.println("FastTagServlets running in to sever"+this.getClass().getSimpleName());
	}

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("running fast tag");
}
	
	

}
