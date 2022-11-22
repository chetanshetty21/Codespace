package com.indianmart.heritance.custom;

public class Resume extends Document {

	public Resume() {
		super();// init variables
	}

	public void display() {
		System.out.println(super.format);
		super.read();
	}

	@Override
	protected void read() {
		System.out.println("override of read in resume");
	}

}
