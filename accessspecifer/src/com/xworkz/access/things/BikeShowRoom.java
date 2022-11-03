package com.xworkz.access.things;

public class BikeShowRoom {
	
		public String shopName = "ADITHYA SHOWROOM";
		public Bike bike;

		public void useBike(Bike bike) {
			System.out.println(bike);
			System.out.println(bike.brand);
			System.out.println(bike.color);
			System.out.println(bike.founderName);
			System.out.println(bike.material);
			System.out.println(bike.mgf);
			System.out.println(bike.price);
			System.out.println(bike.size);
			bike.setType("Honda");
			System.out.println(bike.getType());//electric
			bike.setWarranty(2);
			System.out.println(bike.getWarranty());//1
			bike.setNoOfString(4);
			System.out.println(bike.getNoOfWheels());//6
			bike.setNoOFKeys(4);
			System.out.println(bike.getNoOFKeys());//6

		}

	}


