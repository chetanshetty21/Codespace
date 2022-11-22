package com.xworkz.programme.boots;

public class PrintingChar {

	public static void main(String[] args) {

		System.out.println("creating the square pattern");
		System.out.println(System.lineSeparator());
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= 7; j++) {
				
				if(j==3) {
		         System.out.print("chetan");
				}
				else {
					System.out.print( " "+ j+ " " );
				}

			}
System.out.println(" ");
		}

	}

}
