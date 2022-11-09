package com.medplus.inheritanceoverriding.boot;

import com.medplus.inheritanceoverriding.childclass.Mantri;
import com.medplus.inheritanceoverriding.things.Mall;

public class MallRunner {
	public static void main(String[] args) {
		Mall mall = new Mantri("bengaluru", 200, "asian");
		mall.shopping();

		Mantri mantri = new Mantri("mumbai", 156, "asian");
		mantri.shopping();
	}
}
