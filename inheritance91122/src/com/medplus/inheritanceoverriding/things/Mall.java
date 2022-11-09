package com.medplus.inheritanceoverriding.things;

public class Mall {
	public String address;
	public int totalNoShops;

	public Mall() {
		
	}

	public Mall(String address, int totalNoShops) {
		super();
		this.address = address;
		this.totalNoShops = totalNoShops;
	}

	public void shopping() {
		System.out.println(address);
		System.out.println(totalNoShops);
	}

}