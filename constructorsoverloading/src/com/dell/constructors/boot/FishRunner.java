package com.dell.constructors.boot;

import com.dell.constructors.things.Fish;

public class FishRunner {

	public static void main(String[] args) {

		Fish fish = new Fish("goldy");
		System.out.println("fish name =" + fish.name);
		fish = new Fish("s");
		System.out.println("fish type=" + fish.type);
		fish = new Fish(50d);
		System.out.println("fish price=" + fish.price);
		fish = new Fish(25f);
		System.out.println("fish weight=" + fish.weight);
		fish = new Fish(155.6);
		System.out.println("fish length=" + fish.length);
		fish = new Fish("charu", 150);
		System.out.println("fish name and price " + fish.name + fish.price);
		fish = new Fish("raga", 55.5f);
		System.out.println("fish name and weight" + fish.name + fish.weight);
		fish = new Fish("charu", 66l);
		System.out.println("fish name and long" + fish.name + fish.length);
		fish = new Fish(87.5f, 150);
		System.out.println("fish name and price" + fish.weight + fish.length);
		Fish fish1 = new Fish("ruby");
		System.out.println("fish name =" + fish1.name);
		fish1 = new Fish("s");
		System.out.println("fish type=" + fish1.type);
		fish1 = new Fish(50d);
		System.out.println("fish price=" + fish1.price);
		fish1 = new Fish(25f);
		System.out.println("fish weight=" + fish1.weight);
		fish1 = new Fish(155.6);
		System.out.println("fish length=" + fish1.length);
		fish1 = new Fish("charu", 150);
		System.out.println("fish name and price " + fish1.name + fish1.price);
		fish1 = new Fish("raga", 55.5f);
		System.out.println("fish name and weight" + fish1.name + fish1.weight);
		fish1 = new Fish("charu", 66l);
		System.out.println("fish name and long" + fish1.name + fish1.length);
		fish1 = new Fish(87.5f, 150);
		System.out.println("fish name and price" + fish1.weight + fish1.length);
	}

}
