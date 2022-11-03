package com.xworkz.access.boot;

import com.xworkz.access.things.Guitar;
import com.xworkz.access.things.MusicalsStore;

public class MusicalStoreRunner {

	public static void main(String[] args) {

		MusicalsStore store = new MusicalsStore();
		Guitar guitar = new Guitar();

		store.useGuitar(guitar);
		System.out.println(store.shopName);
		System.out.println(guitar.brand);
		System.out.println(guitar.color);
		System.out.println(guitar.mgf);
		System.out.println(guitar.price);
		System.out.println(guitar.size);
		System.out.println(guitar.getNoOFKeys());
		// guitar.setNoOFKeys(5); because it is in default and u can not access the set
		// method
		System.out.println(guitar.getNoOfString());

		System.out.println(guitar.getType());
		System.out.println(guitar.getWarranty());
	}

}
