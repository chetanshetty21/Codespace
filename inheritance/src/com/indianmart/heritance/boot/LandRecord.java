package com.indianmart.heritance.boot;

import com.indianmart.heritance.custom.Document;

public class LandRecord extends Document {

	public LandRecord() {
		super();
	}

	public void show() {
		System.out.println(super.format);
		super.read();
	}

	public String getFormat() {
		return super.format;
	}

	public static void read() {
		System.out.println("Read from land record...");

	}

}
