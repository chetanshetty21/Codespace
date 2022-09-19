class SportsRunner{
	public static void main(String[] racer){
		System.out.println("team player name");
		String[] playersname= {"Shikhar Dhawan","Virat Kohli","Ravindra Jadeja","manish pandey","shreya lyer","kl rahul","hardik pandya","Rishabh pant"," prithvi shaw","bumrah"};
		int[] playersjarseyno1= {1,2,3,4,5,6,7,8,9,10};
		double[] playerssalaries= {10,20,30,40,50,60,70,80,90,100};
		long[] playersmobilenumbers= {1010101010l,2020202020l,3030303030l,4040404040l,50505050l,60606060l,707070l,80808080l,90909090l,10010101010l};
		int[] playersnoofmatch={2,32,23,34,44,55,55,66,77,78};
		String[] playersname1={"aa","ss","sd","ff","gg","cc","gg","gr","re","rrr"};
		
		Sports.cricketTeamMembers(playersname);
		Sports.kabbadiTeamMembersJerseynos(playersjarseyno1);
		Sports.footBallTeamMembersSalary(playerssalaries);
		Sports.ludoTeamMembersMobileNos(playersmobilenumbers);
		Sports.hockeyTeamMembersMobileNos(playersnoofmatch);
	    Sports.kokoTeamMembersCountryName(playersname1);
	
	}
	
	
}


