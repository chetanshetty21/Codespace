package com.tcl.relation.things;

public class Temple {
	
		public String name;
		public God god;
		public String pujari;
		public int visiters;

		public Temple(String name, String pujari, int visiters) {
			super();
			this.name = name;
			this.pujari = pujari;
			this.visiters = visiters;
		}

		public void show() {
			System.out.println("Temple name " + name);
			System.out.println("Temple pujari " + pujari);
			System.out.println("visiters " + visiters);
			God god = new God("vishnu", "male", "trupathi");
			god.show();
		}

}
