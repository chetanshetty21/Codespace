package com.bisle.constans.boot;
import com.bisle.constans.enumber.*;
public class Mall {


	//import com.bisle.constans.enumber.FoodItems;

	

		public String name;
		public double ph;
		public int shopNumber;
		public float gstNo;
		public Long token;
		public Product product = Product.BRUSH;
		public String[] paymentMode;
		public String[] counterNo;
		public String[] productItemsPrice;
		public String[] billNo;
		public String[] location;

		public Mall(String name, double ph, int shopNumber, float gstNo, Long token, Product product,
				String[] paymentMode, String[] counterNo, String[] productItemsPrice, String[] billNo, String[] location) {

			this.name = name;
			this.ph = ph;
			this.shopNumber = shopNumber;
			this.gstNo = gstNo;
			this.token = token;
			this.product = product;
			this.paymentMode = paymentMode;
			this.counterNo = counterNo;
			this.productItemsPrice = productItemsPrice;
			this.billNo = billNo;
			this.location = location;
			
		}
			public void details() {
				System.out.println("name");
				System.out.println(ph);
				System.out.println(shopNumber);
				System.out.println(gstNo);
				System.out.println(token);
				System.out.println(product);
				System.out.println(paymentMode);
				System.out.println(counterNo);
				System.out.println(productItemsPrice);
				System.out.println(billNo);
				System.out.println(location);
				for (int i = 0; i < billNo.length; i++) {
					String string = billNo[i];
					System.out.println(string);
				}
				for (int i = 0; i < location.length; i++) {
					String string = location[i];
					System.out.println(string);
					
				}
				for (int i = 0; i <productItemsPrice.length; i++) {
					String string = productItemsPrice[i];
					System.out.println(string);
					
					
				}
				for (int i = 0; i < counterNo.length; i++) {
					String string = counterNo[i];
					System.out.println(string);
				}
				for (int i = 0; i < paymentMode.length; i++) {
					String string = paymentMode[i];
					System.out.println(string);
				}
				
			}
			}



