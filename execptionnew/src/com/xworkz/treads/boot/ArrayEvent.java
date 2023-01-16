package com.xworkz.treads.boot;

public class ArrayEvent {

	public static void main(String[] args) {
		System.out.println("main method starting");
		try {
			int my[] = new int[3];
			my[0] = 11;
			my[1] = 12;
			my[2] = 22;

			my[3] = 33;

		} catch (ArrayIndexOutOfBoundsException aiobe) {
			System.err.println("size is limited");
		}
		System.out.println("main method is ended");
	}

}
