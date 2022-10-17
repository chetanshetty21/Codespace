package com.dell.constructors.things;



	public class Bread {
		public String shape;
		public char type;
		public float price;
		public String companyName;
		public double quantity;

		public Bread(String shape) {
			this.shape = shape;
		}

		public Bread(char type) {
			this.type = type;
		}

		public Bread(float price) {
			this.price = price;
		}

		public Bread(double quantity) {
			this.quantity = quantity;
		}

		public Bread(String shape, String companyName) {
			this.shape = shape;
			this.companyName = companyName;

		}
		public Bread(String shape, char type) {
			this.shape = shape;
			this.type = type;

		}
		public Bread(String shape, float price) {
			this.shape = shape;
			this.price =price;

		}
		public Bread(double quantity,String shape ) {
			this.quantity = quantity;
			this.shape=shape;

		}


	}

