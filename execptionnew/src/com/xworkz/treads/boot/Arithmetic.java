package com.xworkz.treads.boot;

public class Arithmetic {

	public static void main(String[] args) {
		System.out.println("starting main method");
		int i = 90;
		int j = 0;
		try {

			System.out.println(i / j);
			System.err.println("SOMETING is fishy");
		} catch (ArithmeticException ae) {
			System.out.println("it can not be solved");
		}
	}

}
