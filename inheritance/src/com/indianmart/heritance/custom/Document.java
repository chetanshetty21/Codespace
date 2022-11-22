package com.indianmart.heritance.custom;

public class Document {

	protected String format;

	public Document() {
		System.out.println("running  default consu of document...");
	}

	public static void read() {
		System.out.println("running read from document");
	}

}
