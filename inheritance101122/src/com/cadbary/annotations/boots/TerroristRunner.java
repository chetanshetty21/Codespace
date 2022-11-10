package com.cadbary.annotations.boots;

import com.cadbary.annotations.childclass.Kasab;
import com.cadbary.annotations.things.Terrorist;

public class TerroristRunner {

	public static void main(String[] args) {
		Terrorist terrorist1 = new Kasab();
		terrorist1.criminal();
		terrorist1.terrorist();
	}

}
