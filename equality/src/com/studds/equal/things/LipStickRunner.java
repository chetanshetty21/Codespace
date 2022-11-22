package com.studds.equal.things;

public class LipStickRunner {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub


			LipStick lipstick = new LipStick("lipstick",444,"Lakme","red",false,"Hindustan Unilever","Low Price","Mumbai","Red Bull","GST");
			System.out.println(lipstick);



			LipStick lipstick2 = new LipStick("lipstick",444,"Lakme","red",true,"Hindustan Unilever","Low Price","Mumbai","Red Bull","GST");
			System.out.println(lipstick2);


			boolean same = lipstick.equals(lipstick2);
			System.out.println(same);





		}
}
