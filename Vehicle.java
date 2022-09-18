class Vehicle{
static double transport(String source,String destination) 
{
		System.out.println("entered the source destination");
		if(source=="bombay"&&destination=="bangalore")
		{
			System.out.println(" The destination from " +source+" to "+destination +" is");
			return 900d;
		}
		return 0.0d;
}
static double transport(String Source,String destination,double ontime){
	
	System.out.println("enterd Source, destination and on time");
	if(Source=="bombay"&&destination=="bangalore"&&ontime==7.5){
		System.out.println("The destination from " +Source+" to "+destination +" is "+ontime);
		return 7.5;
			}
	return 0.0; 
}
	static boolean transport(String destination){
		System.out.println("the vehical reached destination or not");
		if (destination=="bangalore")
		{
			System.out.println("vehical reached the destination or not ");
		return true;
	}
		return false;
		
		
	}
	static boolean transport(String destination,double ontime){
	System.out.println("entered the destination");
	if (destination=="bangalore"&&ontime==3.5d)
	{
		System.out.println("vehical reached destination on time or not");
		return  true;
	}
	return false;
}

static boolean transport(double time){
	
	System.out.println("vechical reached on time or not");
	if (time==5.5)
	{
		System.out.println("vechile reachedon time");
		return true;
		
	}
	return false;
}

}	

 
	 
 