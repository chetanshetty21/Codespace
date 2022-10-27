package com.tcl.relation.things;

public class God {
	
		public String name;
		public String gender;
		public String power;
		public Weapons weapons;

		public God(String name, String gender, String power) {
			super();
			this.name = name;
			this.gender = gender;
			this.power = power;
		}

		public void show() {
			System.out.println("God name " + name);
			System.out.println(gender);
			System.out.println("God power " + power);
			Weapons weapons = new Weapons("Sudarshan Chakra", "Hold in Hand", 8.255);
			weapons.show();
		}
}
