package com.sony.instance.boot;
import com.sony.instance.things.*;
public class OvenRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	

		
				String[] brand1 = { "sony", "samsung" };
				String[] color1 = { "red", "black", "blue", "white" };
				String[] modelNo1 = { "789", "852", "456", "254" };
				String[] accessories1 = { "stand", "ampflier" };
				String[] motherBoard1 = { "cde8754", "def785", "gfr782" };
				String[] modelName1 = { "pulsar", "fz" };
			Oven oven = new Oven(152520d, true, 5248f, true, 125l, brand1, color1, modelNo1, accessories1, motherBoard1,
						modelName1);

				oven.display();
				

			}

		


	}


