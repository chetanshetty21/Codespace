package com.xworkz.programme.boots;

public class leftAngle {

	public static void main(String[] args) {
		int n = 5;
		// main loop
		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print("-");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print("&");

			}
			System.out.println("");

		}

	}

}
