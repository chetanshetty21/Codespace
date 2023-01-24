package com.xworkz.hyrider.serlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/table")
public class VoliniServlets extends HttpServlet {
	public VoliniServlets() {
		System.out.println("running " + getClass().getSimpleName());
	}@Override
	public void init() throws ServletException {
		System.out.println("creating init in volini");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("displaying data  as dopost");
		String data = "The greatest glory in living lies not in never falling, but in rising every time we fall.";
		PrintWriter printWriter = resp.getWriter();
		printWriter.print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("displaying data  as doget");
		String idea = "The way to get started is to quit talking and begin doing. ";
		PrintWriter printWriter = resp.getWriter();
		printWriter.print(idea);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("displaying data  as doOption");
		String info = "If life were predictable it would cease to be life, and be without flavor. ";
		PrintWriter printWriter = resp.getWriter();
		//ServletOutputStream write =resp.getOutputStream();
		printWriter.print(info);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("displaying data  as doPut");
		String details = "Your time is limited, so don't waste it living someone else's life";
		PrintWriter printWriter = resp.getWriter();
		printWriter.print(details);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("displaying data  as dohead");
		String research = "Life is what happens when you're busy making other plans.";
		PrintWriter printWriter = resp.getWriter();
		printWriter.print(research);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("displaying data  as doTrace");
		String ref = "If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success.";
		PrintWriter printWriter = resp.getWriter();
		printWriter.print(ref);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("displaying data  as doDelete");
		String end = "If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough.";
		PrintWriter printWriter = resp.getWriter();
		printWriter.print(end);
		resp.setContentType("text/plain");
	}
}
