class VehicleRunner{
   public static void main(String [] racer){
	   
	double ref = Vehicle.transport("bombay","bangalore");
	   
	   System.out.println(ref);
	   
	 double ref2 = Vehicle.transport("bombay","bangalore",7.5);
	 System.out.println(ref2);
	 boolean ref3=Vehicle.transport("bangalore");
	 System.out.println(ref3);
	  boolean ref4=Vehicle.transport("bangalore",3.5);
	  System.out.println(ref4);
	  boolean ref5=Vehicle.transport("5.5");
	  System.out.println(ref5);
	  
	 
	   
	   
   }






}