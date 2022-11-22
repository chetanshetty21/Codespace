package com.xworkz.programme.boots;

public class PrintingChar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("creating the square pattern");
		System.out.println(System.lineSeparator());
		for (int i = 0; i <= 7; i++) {
			for (int j = 0; j <= 7; j++) {
				
				if(i==3) {
		         System.out.print("games");
				}
				else {
					System.out.print( " "+ j+ " " );
				}

			}
System.out.println(" ");
		}
	}

}
