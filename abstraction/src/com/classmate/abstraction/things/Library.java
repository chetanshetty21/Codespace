package com.classmate.abstraction.things;

import com.classmate.abstraction.rules.LibRules;

public class Library {
	protected LibRules libRules;

	public Library(LibRules libRules) {
	this.libRules=libRules;
	
		System.out.println("this is parmeterized const");
	}

	public Library() {
		System.out.println("this is default const");
	}
	public void checkLib() {
		System.out.println("checking for null pointing");
	 if(this.libRules!=null) {
		 double lib=this.libRules.returnTime()	;
	if(lib>5) {
		System.out.println("it is not pointing to null");
	}
	 }
	 else {
		 System.out.println("it is pointing to null");
	 }
	 
	}
}
