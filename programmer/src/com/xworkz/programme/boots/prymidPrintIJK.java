package com.xworkz.programme.boots;

public class prymidPrintIJK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		// main loop
		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print("-");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);

			}
			System.out.println("");

		}
	}

}
