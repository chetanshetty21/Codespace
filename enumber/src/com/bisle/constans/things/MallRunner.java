package com.bisle.constans.things;
import com.bisle.constans.boot.Mall;
import com.bisle.constans.enumber.*;
public class MallRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	

		
				// TODO Auto-generated method stub
				String[] paymentMode = { "cash", "card" };
				String[] counterNo = { "red", "black", "blue", "white" };
				String[] productItemsPrice = { "rice=50", "brush=50" };
				String[] billNo = { "785625", "4554" };
				String[] location = { "mahalakshmi layout", "navarg" };
				
				Mall mall = new Mall("orion", 785458785d, 125, 125458795f, 785l, Product .BRUSH, paymentMode, counterNo,
						productItemsPrice, billNo, location);

				System.out.println(mall);
				
				mall.details();
			}

	}


