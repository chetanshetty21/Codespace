package com.samsung.chaining.boot;

import com.samsung.chaining.things.Tractor;

public class TractorRunner {

	public static void main(String[] args) {
		System.out.println("entering the details of tractor");
		Tractor ref = new Tractor("yauvaraj");
		System.out.println("name of the tractor=" + ref.name);

		ref = new Tractor("yauvaraj", "Mahindra");
		System.out.println("name of the tractor=" + ref.name);
		System.out.println("name of the tractor=" + ref.brand);
		
		
		ref = new Tractor("yauvaraj", "Mahindra",300000);
		System.out.println("name of the tractor=" + ref.name);
		System.out.println("name of the tractor=" + ref.brand);
		System.out.println("name of the tractor=" + ref.price);
		
		ref = new Tractor("yauvaraj", "Mahindra","red",300000);
		System.out.println("name of the tractor=" + ref.name);
		System.out.println("name of the tractor=" + ref.brand);
		System.out.println("name of the tractor=" + ref.price);
		System.out.println("name of the tractor=" + ref.color);

		ref = new Tractor("yauvaraj", "Mahindra","red",300000,50d);
		System.out.println("name of the tractor=" + ref.name);
		System.out.println("name of the tractor=" + ref.brand);
		System.out.println("name of the tractor=" + ref.price);
		System.out.println("name of the tractor=" + ref.color);
		System.out.println("name of the tractor=" + ref.hp);
		
		ref = new Tractor("yauvaraj", "Mahindra","red",300000 ,50,"5894mfa");
		System.out.println("name of the tractor=" + ref.name);
		System.out.println("name of the tractor=" + ref.brand);
		System.out.println("name of the tractor=" + ref.price);
		System.out.println("name of the tractor=" + ref.color);
		System.out.println("name of the tractor=" + ref.modelNumber);
	}

}
