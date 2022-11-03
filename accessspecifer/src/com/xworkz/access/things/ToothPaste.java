package com.xworkz.access.things;

public class ToothPaste {

	public String brand = "Colgate";
	public double price = 65;
	private String type = "teeth";
	public char size = 'm';
	public String color = "cream color";
	public String mgf = "26 1 22";
	private int warranty = 1;
	String material = "calcium hydrogen phosphates";
	private int noOfPack = 6;
	String founderName = "chetan";
	private int noOFSets = 6;

	public String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}

	public int getWarranty() {
		return warranty;
	}

	void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public int getNoOfPacks() {
		return noOfPack;
	}

	void setNoOfPack(int noOfPacks) {
		this.noOfPack = noOfPacks;
	}

	public int getNoOFSets() {
		return noOFSets;
	}

	void setNoOFSets(int noOFSets) {
		this.noOFSets = noOFSets;
	}

}

