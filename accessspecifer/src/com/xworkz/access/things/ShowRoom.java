package com.xworkz.access.things;

public class ShowRoom {

	public String shopName = "PAI SHOWROOM";
	public TeleVision television;

	public void useTeleVision(TeleVision television) {
		System.out.println(television);
		System.out.println(television.brand);
		System.out.println(television.color);
		System.out.println(television.founderName);
		System.out.println(television.material);
		System.out.println(television.mgf);
		System.out.println(television.price);
		System.out.println(television.size);
		television.setType("QLED");
		System.out.println(television.getType());// electric
		television.setWarranty(2);
		System.out.println(television.getWarranty());// 1
		television.setNoOfString(4);
		System.out.println(television.getNoOfWire());// 6
		television.setNoOFKeys(4);
		System.out.println(television.getNoOFKeys());// 6

	}

}
