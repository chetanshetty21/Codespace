package com.samsung.chaining.things;

public class TextileShop {

	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public double ownerDaughterMobleNumber;
	public float ownerNoOfWifes;
	public int ShopNumber;
	public long contactNumber;

	public TextileShop(String ownerName) {
		this.ownerName = ownerName ;
	}

	public TextileShop(String ownerName ,double ownerDaughterMobleNumber) {
		this( ownerName);
	
		this.ownerDaughterMobleNumber = ownerDaughterMobleNumber;

	}

	public TextileShop(String ownerName ,double ownerDaughterMobleNumber ,float ownerNoOfWifes) {
		this( ownerName,ownerDaughterMobleNumber);
		this.ownerNoOfWifes = ownerNoOfWifes;
	}

	public  TextileShop (String ownerName ,double ownerDaughterMobleNumber ,float ownerNoOfWifes,int ShopNumber) {
		this( ownerName,ownerDaughterMobleNumber,ownerNoOfWifes);	
		this.ShopNumber=ShopNumber;
		
}
	public  TextileShop (String ownerName ,double ownerDaughterMobleNumber ,float ownerNoOfWifes,int ShopNumber,long contactNumber) {
		this( ownerName,ownerDaughterMobleNumber,ownerNoOfWifes,ShopNumber);	
		this.contactNumber=contactNumber;
		
	}
	public  TextileShop (String ownerName ,String ownerWifeName,double ownerDaughterMobleNumber ,float ownerNoOfWifes,int ShopNumber,long contactNumber) {
		this( ownerName,ownerDaughterMobleNumber,ownerNoOfWifes,ShopNumber);	
		this.ownerWifeName=ownerWifeName;
		
	}
	public  TextileShop (String ownerName , String ownerDaughterName,String ownerWifeName,double ownerDaughterMobleNumber ,float ownerNoOfWifes,int ShopNumber,long contactNumber) {
		this( ownerName,ownerDaughterMobleNumber,ownerNoOfWifes,ShopNumber);	
		this.ownerDaughterName=ownerDaughterName;
		
	}
	public TextileShop(int ShopNumber) {
		//this( ownerName,ownerDaughterMobleNumber,ownerNoOfWifes,ShopNumber);	
this .ShopNumber=ShopNumber;
	}
}
