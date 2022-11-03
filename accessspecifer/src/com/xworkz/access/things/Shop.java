package com.xworkz.access.things;

public class Shop {
	public String shopName = "VENKATESHWARA STORE";
	public Soap soap;

	public void useSoap(Soap soap) {
		System.out.println(soap);
		System.out.println(soap.brand);
		System.out.println(soap.color);
		System.out.println(soap.founderName);
		System.out.println(soap.material);
		System.out.println(soap.mgf);
		System.out.println(soap.price);
		System.out.println(soap.size);
		soap.setType("DOVE");
		System.out.println(soap.getType());
		soap.setWarranty(2);
		System.out.println(soap.getWarranty());
		soap.setNoOfPack(4);
		System.out.println(soap.getNoOfPacks());
		soap.setNoOFSets(4);
		System.out.println(soap.getNoOFSets());

	}

}


