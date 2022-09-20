class Thar{
	static double mileage;
	static String type;
	static long cc;
	static double power;
	static String colour;
	static int seatingCapacity;
	static int groundClearnce;
	static int fuelTankCapacity;
	static int noOfCylinder;
	static String bodyType;
	static String tramisssionType;
	static double torque;
	static String[] parts;
	static void thardetails()
	
	{
		
		System.out.println(mileage);
		System.out.println(type);
		System.out.println(cc);
		System.out.println(power);
		System.out.println(colour);
		System.out.println(seatingCapacity);
		System.out.println(groundClearnce);
		System.out.println(fuelTankCapacity);
		System.out.println(noOfCylinder);
		System.out.println(bodyType);
		System.out.println(tramisssionType);
		System.out.println(torque);
		System.out.println(parts);
		if(parts!=null){
			
			for(int details=0;details<parts.length;details++)
			{
				String ref=parts[details];
				System.out.println(ref+details);
				//System.out.println(parts.length);
				
		}
		}		
			else{
				
				System.out.println("bye");
				
				
			}
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
