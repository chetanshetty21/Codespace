package com.bisle.constans.things;

import com.bisle.constans.boot.Hotel;
import com.bisle.constans.enumber.*;

public class HotelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] paymentMode = { "cash", "card" };
		String[] counterNo = { "red", "black", "blue", "white" };
		String[] foodItemsPrice = { "dosa=50", "vada=50" };
		String[] billNo = { "785625", "4554" };
		String[] location = { "mahalakshmi layout", "navarg" };
		
		Hotel hotel = new Hotel("swaithi", 785458785d, 125, 125458795f, 785l, FoodItems.DOSA, paymentMode, counterNo,
				foodItemsPrice, billNo, location);

		System.out.println(hotel);
		
		hotel.details();
	}

}
