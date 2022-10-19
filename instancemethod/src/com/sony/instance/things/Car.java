
package com.sony.instance.things;

public class Car {

	public double price;
	public boolean electric;
	public float shopNo;
	public boolean gear;
	public long cc;
	public String[] brand;
	public String[] color;
	public String[] modelNo;
	public String[] accessories;
	public String[] charsiNo;
	public String[] modelName;

public Car(double price, boolean electric, float shopno, boolean gear, long cc, String[] brand, String[] color,
				String[] modelNo, String[] accessories, String[] charsiNo, String[] modelName) {
			this.price = price;
			this.electric = electric;
			this.shopNo = shopno;
			this.gear = gear;
			this.cc = cc;
			this.brand = brand;
			this.color = color;
			this.modelNo = modelNo;
			this.accessories = accessories;
			this.charsiNo = charsiNo;
			this.modelName = modelName;

		}

	public void display() {
		System.out.println("=======///=====///===");
		System.out.println(this.price);
		System.out.println(this.electric);
		System.out.println(this.shopNo);
		System.out.println(this.gear);
		System.out.println(this.cc);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.modelNo);
		System.out.println(this.accessories);
		System.out.println(this.charsiNo);
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
		for (int i = 0; i < charsiNo.length; i++) {
			String string = charsiNo[i];
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
