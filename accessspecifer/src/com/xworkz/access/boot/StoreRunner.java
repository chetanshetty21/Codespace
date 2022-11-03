package com.xworkz.access.boot;

import com.xworkz.access.things.*;

public class StoreRunner {

	public static void main(String[] args) {
		Store store = new Store();
		ToothPaste toothPaste = new ToothPaste();

		store.useStore(toothPaste);
		System.out.println(store.shopName);
		System.out.println(toothPaste.brand);
		System.out.println(toothPaste.color);
		System.out.println(toothPaste.mgf);
		System.out.println(toothPaste.price);
		System.out.println(toothPaste.size);
		System.out.println(toothPaste.getNoOFSets());
		// soap.setNoOFsets(5); because it is in default and u can not access the set
		// method
		System.out.println(toothPaste.getNoOfPacks());

		System.out.println(toothPaste.getType());
		System.out.println(toothPaste.getWarranty());
	}

}
