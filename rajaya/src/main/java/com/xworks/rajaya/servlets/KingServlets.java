package com.xworks.rajaya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/kingdom")
public class KingServlets extends HttpServlet {

	public void init() throws ServletException {
		System.out.println("creating King");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running" + getClass().getSimpleName());
		String name = req.getParameter("name of the king");
		String region = req.getParameter("region of the kingdom");
		String noOfQueens = req.getParameter("no of queens for the  king");
		String dob = req.getParameter("DOB of the king");
		String dod = req.getParameter("DOD of the king");
		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(dob);
		System.out.println(dod);
		PrintWriter printWriter = resp.getWriter();

		printWriter.print("<html>");
		printWriter.print("<body>");
		printWriter.print("<h1>");
		printWriter.print("<pre>");
		printWriter.print("<span style='color:green;'>");
		printWriter.print("name of the king" + name + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:red;'>");
		printWriter.print("region of the kingdom  " + region + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:pink;'>");
		printWriter.print("no of queens for the  king " + noOfQueens + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:blue;'>");
		printWriter.print("DOB of the king " + dob + " is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:black;'>");
		printWriter.print("DOD of the king " + dod + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("</pre>");
		printWriter.print("</span>");
		printWriter.print("</h1>");
		printWriter.print("</body>");
		printWriter.print("</html>");
		resp.setContentType("text/html");

	}

}
