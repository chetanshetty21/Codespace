package com.xworkz.access.things;

public class Mall {
	
		public String shopName = "veenaMusicals";
		public Watch watch;

		public void useWatch(Watch watch) {
			System.out.println(watch);
			System.out.println(watch.brand);
			System.out.println(watch.color);
			System.out.println(watch.founderName);
			System.out.println(watch.material);
			System.out.println(watch.mgf);
			System.out.println(watch.price);
			System.out.println(watch.size);
			watch.setType("Digital");
			System.out.println(watch.getType());//electric
			watch.setWarranty(2);
			System.out.println(watch.getWarranty());//1
			watch.setNoOfString(4);
			System.out.println(watch.getNoOfPointer());//6
			watch.setNoOFKeys(4);
			System.out.println(watch.getNoOFKeys());//6

		}

		

	}


