package com.xworkz.access.things;

public class MobileShop {
	
		public String shopName = "KA 02 CELLWORD";
		public Mobile mobile;

		public void useMobile(Mobile mobile) {
			System.out.println(mobile);
			System.out.println(mobile.brand);
			System.out.println(mobile.color);
			System.out.println(mobile.founderName);
			System.out.println(mobile.material);
			System.out.println(mobile.mgf);
			System.out.println(mobile.price);
			System.out.println(mobile.size);
			mobile.setType("LG");
			System.out.println(mobile.getType());
			mobile.setWarranty(2);
			System.out.println(mobile.getWarranty());
			mobile.setNoOfSim(4);
			System.out.println(mobile.getNoOfSim());
			mobile.setNoOFKeys(4);
			System.out.println(mobile.getNoOFKeys());

		}

	}




