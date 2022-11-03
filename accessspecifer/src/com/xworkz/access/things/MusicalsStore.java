package com.xworkz.access.things;

public class MusicalsStore {
	public String shopName = "veenaMusicals";
	public Guitar guitar;

	public void useGuitar(Guitar guitar) {
		System.out.println(guitar);
		System.out.println(guitar.brand);
		System.out.println(guitar.color);
		System.out.println(guitar.founderName);
		System.out.println(guitar.material);
		System.out.println(guitar.mgf);
		System.out.println(guitar.price);
		System.out.println(guitar.size);
		guitar.setType("ACOSITC");
		System.out.println(guitar.getType());//electric
		guitar.setWarranty(2);
		System.out.println(guitar.getWarranty());//1
		guitar.setNoOfString(4);
		System.out.println(guitar.getNoOfString());//6
		guitar.setNoOFKeys(4);
		System.out.println(guitar.getNoOFKeys());//6

	}

}
