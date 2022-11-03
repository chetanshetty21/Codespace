package com.xworkz.access.things;

public class Mobile {

		public String brand="noika";
		public double price=5500d;
		private String type="keypad" ;
		public char size='m';
		public String color="cream color";
		public String mgf="26 1 22";
		private int warranty=1;
		 String material="Metal";
		private int noOfSim=6;
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

		public int getNoOfSim() {
			return noOfSim;
		}

		public void setNoOfSim(int noOfSim) {
			this.noOfSim = noOfSim;
		}

		public int getNoOFKeys() {
			return noOFKeys;
		}

		 void setNoOFKeys(int noOFKeys) {
			this.noOFKeys = noOFKeys;
		}

	}

