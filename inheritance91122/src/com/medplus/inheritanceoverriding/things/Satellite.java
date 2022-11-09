package com.medplus.inheritanceoverriding.things;

public class Satellite {

	public String name;
	public String origin;

	public Satellite() {
	}

	public Satellite(String name, String origin) {
		super();
		this.name = name;
		this.origin = origin;
	}

	public void revolve() {
		System.out.println(name);
		System.out.println(origin);
	}

}
