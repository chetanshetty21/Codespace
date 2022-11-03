package com.xworkz.access.boot;

import com.xworkz.access.things.Mall;
import com.xworkz.access.things.Watch;

public class MallRunner {

	public static void main(String[] args) {

		Mall store = new Mall();
		Watch watch = new Watch();

		store. useWatch(  watch);
		System.out.println(store.shopName);
		System.out.println(watch.brand);
		System.out.println(watch.color);
		System.out.println(watch.mgf);
		System.out.println(watch.price);
		System.out.println(watch.size);
		System.out.println(watch.getNoOFKeys());
		// guitar.setNoOFKeys(5); because it is in default and u can not access the set
		// method
		System.out.println(watch.getNoOfPointer());

		System.out.println(watch.getType());
		System.out.println(watch.getWarranty());
	}

}
