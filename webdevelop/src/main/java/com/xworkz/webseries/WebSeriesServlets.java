package com.xworkz.webseries;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/series")
public class WebSeriesServlets extends HttpServlet {

	public void init() throws ServletException {
		System.out.println("creating webservice");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running" + getClass().getSimpleName());
		String name = req.getParameter("name of the series");
		String lang = req.getParameter("lang of the series");
		String episodes = req.getParameter("episodes of the series");
		String ott = req.getParameter("ott of the series");
		String budget = req.getParameter("budget of the series");
		System.out.println(name);
		System.out.println(lang);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.print("<html>");
		printWriter.print("<body>");
		printWriter.print("<h1>");
		printWriter.print("<pre>");

		printWriter.print("<span style='color:green;'>");
		printWriter.print("name of the series  " + name + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:red;'>");
		printWriter.print("lang of the series  " + lang + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:pink;'>");
		printWriter.print("episodes of the series  " + episodes + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:blue;'>");
		printWriter.print("ott of the series  " + ott + " is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:black;'>");
		printWriter.print("budget of the series " + budget + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("</pre>");
		printWriter.print("</span>");
		printWriter.print("</h1>");
		printWriter.print("</body>");
		printWriter.print("</html>");
		resp.setContentType("text/html");

	}

}
