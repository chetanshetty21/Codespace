package com.xworkz.access.boot;

import com.xworkz.access.things.Soap;
import com.xworkz.access.things.Shop;

public class SoapRunner {

	public static void main(String[] args) {
		Shop store = new Shop();
		Soap soap = new Soap();

		store.useSoap(soap);
		System.out.println(store.shopName);
		System.out.println(soap.brand);
		System.out.println(soap.color);
		System.out.println(soap.mgf);
		System.out.println(soap.price);
		System.out.println(soap.size);
		System.out.println(soap.getNoOFSets());
		// soap.setNoOFsets(5); because it is in default and u can not access the set
		// method
		System.out.println(soap.getNoOfPacks());

		System.out.println(soap.getType());
		System.out.println(soap.getWarranty());
	}

}
