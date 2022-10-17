package com.samsung.chaining.boot;

import com.samsung.chaining.things.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("entering the details of TextileShop");
		
		TextileShop ref=new TextileShop("balraj");
		System.out.println("ownername of the TextileShop="+ref.ownerName);
		
		
		ref=new TextileShop("balraj",7892225217d);
		System.out.println("ownername of the TextileShop"+ref.ownerName+"ownerDaughterMobleNumber"+ref.ownerDaughterMobleNumber);
		
		ref=new TextileShop("balraj",7892225217d,50);
		System.out.println("ownername of the TextileShop"+ref.ownerName+"ownerDaughterMobleNumber"+ref.ownerDaughterMobleNumber+"ownerNoOfWifes"+ref.ownerNoOfWifes);
	
		ref=new TextileShop("balraj",7892225217d,50,154);
		System.out.println("ownername of the TextileShop"+ref.ownerName+"ownerDaughterMobleNumber"+ref.ownerDaughterMobleNumber+"ownerNoOfWifes"+ref.ownerNoOfWifes+" contactNumber");
	
		ref=new TextileShop("balraj",7892225217d,50,154,852154697l);
		System.out.println("ownername of the TextileShop"+ref.ownerName+"ownerDaughterMobleNumber"+ref.ownerDaughterMobleNumber+"ownerNoOfWifes"+ref.ownerNoOfWifes+" contactNumber"+ref. contactNumber);
	
		ref=new TextileShop("balraj",7892225217d,50,154,852154697l);
		System.out.println("ownername of the TextileShop"+ref.ownerName+"ownerDaughterMobleNumber"+ref.ownerDaughterMobleNumber+"ownerNoOfWifes"+ref.ownerNoOfWifes+" contactNumber"+ref. contactNumber+" ShopNumber"+ref. ShopNumber);
	}
	
	
	

}
