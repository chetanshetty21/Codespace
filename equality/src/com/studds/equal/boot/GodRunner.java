package com.studds.equal.boot;

import com.studds.equal.things.God;

public class GodRunner {
	public static void main(String[] args) {
		God god=new God("manjunath", "manjunath", 10, 'M', "darmasthala", 6, "prabhu", 20, true, "malarpane");
		System.out.println(god);
		God god2=new God("manjunath", "manjunath", 10, 'M', "darmasthala", 6, "prabhu", 20, true, "malarpane");
		System.out.println(god2);
		boolean same=god.equals(god2);
		System.out.println(same);
	}

}
