package com.xworkz.access.boot;

import com.xworkz.access.things.ShowRoom;
import com.xworkz.access.things.TeleVision;

public class ShowRoomRunner {

	public static void main(String[] args) {

		ShowRoom store = new ShowRoom();
		TeleVision television = new TeleVision();

		store.useTeleVision(television);
		System.out.println(store.shopName);
		System.out.println(television.brand);
		System.out.println(television.color);
		System.out.println(television.mgf);
		System.out.println(television.price);
		System.out.println(television.size);
		System.out.println(television.getNoOFKeys());
		// guitar.setNoOFKeys(5); because it is in default and u can not access the set
		// method
		System.out.println(television.getNoOfWire());

		System.out.println(television.getType());
		System.out.println(television.getWarranty());
	}

}
