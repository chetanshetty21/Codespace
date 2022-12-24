package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.collection.DTO.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) {
		SanitizerDTO dto1 = new SanitizerDTO("code001", "lifeboy", 259D, "white");
		SanitizerDTO dto2 = new SanitizerDTO("code002", "Dettol", 270D, "blue");
		SanitizerDTO dto3 = new SanitizerDTO("code003", "Himalaya", 300D, "pink");
		SanitizerDTO dto4 = new SanitizerDTO("code004", "RangePharma", 400D, "green");
		SanitizerDTO dto5 = new SanitizerDTO("code005", "sterlomax", 500D, "yellow");
		SanitizerDTO dto6 = new SanitizerDTO("code006", "savlon", 600D, "red");
		SanitizerDTO dto7 = new SanitizerDTO("code007", "Davis", 700D, "black");
		SanitizerDTO dto8 = new SanitizerDTO("code008", "khadi", 800D, "brown");
		SanitizerDTO dto9 = new SanitizerDTO("code009", "Palmolive", 900D, "sliver");
		SanitizerDTO dto10 = new SanitizerDTO("code0010", "yardley", 1000D, "orange");
		Collection<SanitizerDTO> collection = new ArrayList<SanitizerDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);

		Iterator<SanitizerDTO> ref1 = collection.iterator();
		while (ref1.hasNext()) {
			SanitizerDTO element = ref1.next();
			if (element.getPrice() > 100) {
				System.out.println("this is above 100" + element);

			}
		}
		Iterator<SanitizerDTO> ref2 = collection.iterator();
		while (ref1.hasNext()) {
			SanitizerDTO element2 = ref2.next();
			if (element2 != null) {
				System.out.println("no element is null" + element2);

			}
		}
		Iterator<SanitizerDTO> ref3 = collection.iterator();
		while (ref3.hasNext()) {
			SanitizerDTO element3 = ref3.next();
			if (element3.getBrand().matches("dettol")) {
				ref3.remove();
				System.out.println("the element does not match" + element3);

			}
		}
		Iterator<SanitizerDTO> ref4 = collection.iterator();
		while (ref4.hasNext()) {
			SanitizerDTO element4 = ref4.next();
			if (element4.getPrice()<500) {
				System.out.println("this is below 500" + element4);

			}
		}
		Iterator<SanitizerDTO> ref5 = collection.iterator();
		while (ref5.hasNext()) {
			SanitizerDTO element5 = ref5.next();
			if (element5.getPrice() > 500) {
				System.out.println("this is above 500" + element5);

			}
		}
		Iterator<SanitizerDTO> ref6 = collection.iterator();
		while (ref6.hasNext()) {
			SanitizerDTO element6 = ref6.next();
			if (element6.getPrice() >700 ) {
				System.out.println("this is above 700" + element6);

			}
		}
	}

}
