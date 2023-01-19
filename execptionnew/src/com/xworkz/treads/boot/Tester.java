package com.xworkz.treads.boot;

public class Tester {

	public static void main(String[] args) {
		System.out.println("main method started");
	Tester.jingala();
	System.out.println("main method ended 00 ");
	
	
	}
	public static void jingala() {
		System.out.println("inside jingala method");
		jingala();
	}

}
