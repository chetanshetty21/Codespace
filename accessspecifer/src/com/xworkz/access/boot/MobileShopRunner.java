package com.xworkz.access.boot;

import com.xworkz.access.things.Mobile;
import com.xworkz.access.things.MobileShop;

public class MobileShopRunner {

	public static void main(String[] args) {

		MobileShop store = new MobileShop();
		Mobile mobile = new Mobile();

		store.useMobile( mobile);
		System.out.println(store.shopName);
		System.out.println(mobile.brand);
		System.out.println(mobile.color);
		System.out.println(mobile.mgf);
		System.out.println(mobile.price);
		System.out.println(mobile.size);
		System.out.println(mobile.getNoOFKeys());
		// guitar.setNoOFKeys(5); because it is in default and u can not access the set
		// method
		System.out.println(mobile.getNoOfSim());

		System.out.println(mobile.getType());
		System.out.println(mobile.getWarranty());
	}

}
