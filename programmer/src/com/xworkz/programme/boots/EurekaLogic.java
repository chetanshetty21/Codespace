package com.xworkz.programme.boots;

import java.util.Scanner;

public class EurekaLogic {

	public static void main(String[] args) {

		Scanner sv = new Scanner(System.in);
		int start = sv.nextInt();
		int end = sv.nextInt();
		// System.out.println(start);
		// System.out.println(end);
		for (int i = start; i <= end; i++) {
			// 1System.out.println("start===" + start + "====" + "range=" + i + "===" +
			// "end===" + end);
			int num = i;
			int temp=num;
			System.out.print("  " + temp);
			int count = 0;
			for (;temp != 0; temp = temp / 10) {
				count++;


			}

			int n=temp;
			int ref=0;
			int sum=0;
			for(;n>0;n=n/10) {
				ref=n%10;
				sum+=(int) Math.pow(ref, count);
				count--;
			}
			if (num==sum) {
				System.out.println(num+" "); 
				
				
			}
			
			
		}

	}

}
