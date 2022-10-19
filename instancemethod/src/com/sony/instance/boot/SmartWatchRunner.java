
	package com.sony.instance.boot;

	import com.sony.instance.things.SmartWatch;

	public class SmartWatchRunner {

		public static void main(String[] args) {
			System.out.println("deatils of the company");
			// TODO Auto-generated method stub
			String[] brand1 = { "sony", "samsung" };
			String[] color1 = { "red", "black", "blue", "white" };
			String[] modelNo1 = { "789", "852", "456", "254" };
			String[] accessories1 = { "stand", "ampflier" };
			String[] motherBoard1 = { "cde8754", "def785", "gfr782" };
			String[] modelName1 = { "pulsar", "fz" };
			SmartWatch smartwatch = new SmartWatch(152520d, true, 5248f, true, 125l, brand1, color1, modelNo1, accessories1, motherBoard1,
					modelName1);

			 smartwatch.display();
			

		}

	}


