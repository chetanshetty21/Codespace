package com.xworkz.access.things;

public class Store {
	

	
		public String shopName = "Shiva STORE";
		public ToothPaste toothPaste;

		public void useStore(ToothPaste toothPaste) {
			System.out.println(toothPaste);
			System.out.println(toothPaste.brand);
			System.out.println(toothPaste.color);
			System.out.println(toothPaste.founderName);
			System.out.println(toothPaste.material);
			System.out.println(toothPaste.mgf);
			System.out.println(toothPaste.price);
			System.out.println(toothPaste.size);
			toothPaste.setType("patanjali");
			System.out.println(toothPaste.getType());
			toothPaste.setWarranty(2);
			System.out.println(toothPaste.getWarranty());
			toothPaste.setNoOfPack(4);
			System.out.println(toothPaste.getNoOfPacks());
			toothPaste.setNoOFSets(4);
			System.out.println(toothPaste.getNoOFSets());

		}

	}



