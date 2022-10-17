package com.dell.constructors.boot;

import com.dell.constructors.things.Bread;


public class BreadRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	Bread bread = new Bread("varana");
				System.out.println("name of the boat " + bread.shape);
				bread= new Bread("m");
				System.out.println("type of the boat " + bread.type);
				bread  = new Bread(7896525f);
				System.out.println("ownerNo of the boat " + bread.price);
				bread = new Bread(1256);
				System.out.println("ColorNo of the boat " + bread.quantity);
				bread  = new Bread("agani" ,"surya");
				System.out.println("name of the boat and CompanyNmae " + bread.shape+bread.companyName);
				bread = new Bread("agani" ,"l");
				System.out.println("name of the boat and CompanyNmae " +bread.shape+bread.type);
				bread = new Bread("agani" ,2545f);
				System.out.println("name of the boat and CompanyNmae " + bread.shape+bread.price);
				bread = new Bread("agani" ,4856);
				System.out.println("name of the boat and CompanyNmae " + bread.shape+bread.quantity);
			}

		}

