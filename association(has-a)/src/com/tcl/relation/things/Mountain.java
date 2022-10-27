package com.tcl.relation.things;

public class Mountain {
	
		public String name;
		public Location location;
		public double height;
		public Temple temple;

		public Mountain(String name, double height) {
			super();
			this.name = name;
			this.height = height;
		}

		public void visitTemple() {
			Temple temple = new Temple("Bholenath", "Shankar", 2000);
			temple.show();
			Location location = new Location("Rudra Prayag", "Kedar Nath", "Uttar Khand", 246445, "Bharat");
			location.show();
			System.out.println("Mountian " + name);
			System.out.println("Mountian height" + height);
		}

	}

