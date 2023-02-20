package com.xworkz.collectionpractice.section;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Method {
	public static void main(String[] args) {

		String name1 = "chetan";
		String name2 = "shashank";
		String name3 = "venky";
		String name4 = "bhagya";
		String name5 = "sita";
		String name6 = "rama";

		Collection<String> collection = new ArrayList();
		collection.add(name1);
		collection.add(name6);
		collection.add(name3);
		collection.add(name4);
		collection.add(name2);
		collection.add("chetan");
		collection.add("chotu");
		System.out.println("this collection");
		System.out.println("count =" + collection.size());
		collection.clear();

		System.out.println("after count =" + collection.size());
	}
}
