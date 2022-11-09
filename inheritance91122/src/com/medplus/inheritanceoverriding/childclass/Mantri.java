package com.medplus.inheritanceoverriding.childclass;

import com.medplus.inheritanceoverriding.things.Mall;

public class Mantri extends  Mall {
	public String owner;

	public Mantri() {
		
	}

	public Mantri(String address, int totalNoShops, String owner) {
		super(address, totalNoShops);
		this.owner=owner;
	}
	public void shopping() {
		super.shopping();
		System.out.println(this.owner);
	}
}
