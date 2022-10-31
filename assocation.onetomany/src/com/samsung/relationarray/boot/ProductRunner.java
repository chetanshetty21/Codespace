package com.samsung.relationarray.boot;

class ProductRunner {
	public static String price;

	public static void main(String[] view) {
		// name type price quantity quality
		System.out.println("entered the view of products");
		int convertedPrice = Integer.parseInt(price);
		System.out.println("converted price is:" + convertedPrice);
	}
}