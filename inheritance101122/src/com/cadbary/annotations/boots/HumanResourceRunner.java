package com.cadbary.annotations.boots;

import com.cadbary.annotations.things.HumanResource;
import com.cadbary.annotations.childclass.*;

public class HumanResourceRunner {

	public static void main(String[] args) {
		HumanResource humanresource = new Akshara();
		humanresource.hire();
		humanresource.fire();
		
	}

}
