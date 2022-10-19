package com.sony.instance.things;

public class CNCMachine {



	public double price;
	public boolean anroid;
	public float shopNo;
	public boolean internetConnection;
	public long screen;
	public String[] brand;
	public String[] color;
	public String[] modelNo;
	public String[] accessories;
	public String[] motherBoardNo;
	public String[] modelName;

     public CNCMachine(double price, boolean anroid, float shopno, boolean internetConnection, long screen, String[] brand, String[] color,
				String[] modelNo, String[] accessories, String[]  motherBoardNo, String[] modelName) {
			this.price = price;
			this.anroid = anroid;
			this.shopNo = shopno;
			this.internetConnection= internetConnection;
			this.screen = screen;
			this.brand = brand;
			this.color = color;
			this.modelNo = modelNo;
			this.accessories = accessories;
			this. motherBoardNo = motherBoardNo;
			this.modelName = modelName;

		}

	public void display() {
		System.out.println("=======///=====///===");
		System.out.println(this.price);
		System.out.println(this.anroid);
		System.out.println(this.shopNo);
		System.out.println(this. internetConnection);
		System.out.println(this.screen);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.modelNo);
		System.out.println(this.accessories);
		System.out.println(this. motherBoardNo);
		System.out.println(this.modelName);

		for (int i = 0; i < this.brand.length; i++) {
			String string = brand[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator());
		for (int j = 0; j < color.length; j++) {
			String string = color[j];
			System.out.println(string);

		}
		System.out.println(System.lineSeparator());
		for (int i = 0; i < accessories.length; i++) {
			String string = accessories[i];
			System.out.println(string);
		}
		for (int i = 0; i <  motherBoardNo.length; i++) {
			String string =  motherBoardNo[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator());
		for (int i = 0; i < modelNo.length; i++) {
			String string = modelNo[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator());
		for (int i = 0; i < modelName.length; i++) {
			String string = modelName[i];
			System.out.println(string);
		}
	}
}


