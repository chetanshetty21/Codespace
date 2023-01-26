package com.xworkz.biodata.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/data")
public class PersonServlets extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("creating person");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("creating " + getClass().getSimpleName());

		String name = req.getParameter("name of the person");
		String age = req.getParameter("age of the person");
		String gender = req.getParameter("gender of the person");
		String weight = req.getParameter("weight of the person");
		String height = req.getParameter("height of the person");
		String ph = req.getParameter("ph of the person");
		String dob = req.getParameter("dob of the person");
		String location = req.getParameter("location of the person");
		String foodtype = req.getParameter("foodtype of the person");
		String job = req.getParameter("job of the person");
		String bloodgroup = req.getParameter("bloodgroup of the person");
		String fathername = req.getParameter("fathername of the person");
		String mothername = req.getParameter("mothername of the person");
		String brothername = req.getParameter("name of the person");
		String education = req.getParameter("education of the person");
		String friendname = req.getParameter("friendname of the person");
		String nooffriends = req.getParameter("no of friends of the person");
		String wifename = req.getParameter("wifename of the person");
		String noofbikes = req.getParameter("noofbikes of the person");
		String noofcars = req.getParameter("noofcars of the person");
		PrintWriter printWriter = resp.getWriter();

		printWriter.print("<html>");
		printWriter.print("<body>");
		printWriter.print("<h1>");
		printWriter.print("<pre>");
		printWriter.print("<span style='color:green;'>");
		printWriter.print("name of the person " + name + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:red;'>");
		printWriter.print("age of the person  " + age + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:pink;'>");
		printWriter.print("gender of the person " + gender + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:blue;'>");
		printWriter.print("weight of the person " + weight + " is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:black;'>");
		printWriter.print("height of the person " + height + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:black;'>");
		printWriter.print("ph of the person " + ph + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:green;'>");
		printWriter.print("dob of the person " + dob + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:red;'>");
		printWriter.print("location of the person " + location + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:brown;'>");
		printWriter.print("foodtype of the person " + foodtype + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:pic;'>");
		printWriter.print("job of the person " + job + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:blue;'>");
		printWriter.print("bloodgroup of the person " + bloodgroup + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:orange;'>");
		printWriter.print("fathername of the person " + fathername + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:pink;'>");
		printWriter.print("mothername of the person " +  mothername + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:yellow;'>");
		printWriter.print("brothername of the person " +  brothername + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:black;'>");
		printWriter.print("education of the person " +  education + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:red;'>");
		printWriter.print("friendname of the person " +  friendname + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:black;'>");
		printWriter.print("no of friends of the person " +  nooffriends + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:pink;'>");
		printWriter.print("wifename of the person " +  wifename + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:green;'>");
		printWriter.print("noofbikes of the person " +  noofbikes + "  is sent successfully");
		printWriter.print("<br>");
		printWriter.print("<span style='color:yellow;'>");
		printWriter.print("noofcars of the person " +  noofcars + "  is sent successfully");
		printWriter.print("<br>");
		
		
		printWriter.print("</pre>");
		printWriter.print("</span>");
		printWriter.print("</h1>");
		printWriter.print("</body>");
		printWriter.print("</html>");
		resp.setContentType("text/html");

	}

}
