package com.xworkz.programme.boots;

public class PrintNameInJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		// main loop
		for (int i = 1; i <= n; i++) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				if (j == 2) {
					System.out.print("chetan");
				}
				System.out.print("-");

			}
			for (int k = 1; k <= i; k++) {
				if (k == 2) {
					System.out.print("hi");
				} else {
					System.out.print(k);
				}
			}
			System.out.println("");

		}
	}

}
