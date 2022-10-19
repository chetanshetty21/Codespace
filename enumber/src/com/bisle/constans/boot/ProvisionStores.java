package com.bisle.constans.boot;

import com.bisle.constans.enumber.*;

public class ProvisionStores {

	public String name;
	public double ph;
	public int shopNumber;
	public float gstNo;
	public Long token;
	public FoodItems fooditems = FoodItems.DOSA;
	public String[] paymentMode;
	public String[] counterNo;
	public String[] foodItemsPrice;
	public String[] billNo;
	public String[] location;

	public ProvisionStores(String name, double ph, int shopNumber, float gstNo, Long token, FoodItems fooditems,
			String[] paymentMode, String[] counterNo, String[] foodItemsPrice, String[] billNo, String[] location) {

		this.name = name;
		this.ph = ph;
		this.shopNumber = shopNumber;
		this.gstNo = gstNo;
		this.token = token;
		this.fooditems = fooditems;
		this.paymentMode = paymentMode;
		this.counterNo = counterNo;
		this.foodItemsPrice = foodItemsPrice;
		this.billNo = billNo;
		this.location = location;
		
	}

	public void details() {
		System.out.println("name");
		System.out.println(ph);
		System.out.println(shopNumber);
		System.out.println(gstNo);
		System.out.println(token);
		System.out.println(fooditems);
		System.out.println(paymentMode);
		System.out.println(counterNo);
		System.out.println(foodItemsPrice);
		System.out.println(billNo);
		System.out.println(location);
		for (int i = 0; i < billNo.length; i++) {
			String string = billNo[i];
			System.out.println(string);
		}
		for (int i = 0; i < location.length; i++) {
			String string = location[i];
			System.out.println(string);

		}
		for (int i = 0; i < foodItemsPrice.length; i++) {
			String string = foodItemsPrice[i];
			System.out.println(string);

		}
		for (int i = 0; i < counterNo.length; i++) {
			String string = counterNo[i];
			System.out.println(string);
		}
		for (int i = 0; i < paymentMode.length; i++) {
			String string = paymentMode[i];
			System.out.println(string);
		}

	}
}
