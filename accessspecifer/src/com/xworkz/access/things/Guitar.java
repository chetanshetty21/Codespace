package com.xworkz.access.things;

public class Guitar {
	public String brand="kadence";
	public double price=5500d;
	private String type="Electric" ;
	public char size='m';
	public String color="cream color";
	public String mgf="26 1 22";
	private int warranty=1;
	 String material="wood";
	private int noOfString=6;
	String founderName="chetan";
	private int noOFKeys=6;

	public String getType() {
		return type;
	}

	 void setType(String type) {
		this.type = type;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public int getNoOfString() {
		return noOfString;
	}

	public void setNoOfString(int noOfString) {
		this.noOfString = noOfString;
	}

	public int getNoOFKeys() {
		return noOFKeys;
	}

	 void setNoOFKeys(int noOFKeys) {
		this.noOFKeys = noOFKeys;
	}

}
