package com.medplus.inheritanceoverriding.childclass;

import com.medplus.inheritanceoverriding.things.Satellite;

public class Moon  extends Satellite {
	
		public int lifeSpan;

		public Moon() {
		}

		public Moon(String name, String origin, int lifeSpan) {
			super(name, origin);
			this.lifeSpan = lifeSpan;
		}

		public void revolve() {
			super.revolve();  //this is to overriding
			System.out.println(lifeSpan);
		}


}
