package com.studds.equal.boot;

import com.studds.equal.things.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		WaterBottle waterbottle = new WaterBottle("coorg", "coldwaterbttle", 5485d, "blue", 5, true, "fsgrw564",
				"aug2022", "sept2035", 586522325d);
		//System.out.println(waterbottle);
		System.out.println(waterbottle);
		WaterBottle waterbottle1 = new WaterBottle("coorg", "coldwaterbttle", 5485d, "blue", 5, true, "fsgrw564",
				"aug2022", "sept2035", 586522325d);
		System.out.println(waterbottle1);
		boolean same=waterbottle .equals(waterbottle1);
		System.out.println(same);
	}

}
