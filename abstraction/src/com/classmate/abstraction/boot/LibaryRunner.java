package com.classmate.abstraction.boot;

import com.classmate.abstraction.obeys.Students;
import com.classmate.abstraction.rules.LibRules;
import com.classmate.abstraction.things.Library;

public class LibaryRunner {

	public static void main(String[] args) {

LibRules libRules =new Students();
Library library=new Library(libRules);
library.checkLib();
library=new Library();
	
	}

}
