class Card{
	static String type;
	static String height;
	static String width;
	static int price;
	static String[]colors;
	
	static void displayDetails()
	{
		System.out.println(type);
		System.out.println(height);
		System.out.println(width);
		System.out.println(price);
		if(colors!=null)
		{
			
			
			
			System.out.println("Array is pointing to memory");
			for(int details=1;details<colors.length;details++)
			{
				String ref =colors[details];
			System.out.println(ref+details);
		}
		
	
	
	
	
	
	
}
else
{
	System.out.println("array ia pointing to array");
}	
		
		
	}
	
	
	
	
	
}