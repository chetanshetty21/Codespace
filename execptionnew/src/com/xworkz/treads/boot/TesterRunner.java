package com.xworkz.treads.boot;

public class TesterRunner {
public static void main(String[] args) {
	
	
	System.out.println("main method started");
	try{String str=null;
	System.out.println(str.charAt(1));
	
	}catch(NullPointerException ne) {
	System.err.println("u r pointing null ");
	}
	System.out.println("main method ended");

}
	
}

