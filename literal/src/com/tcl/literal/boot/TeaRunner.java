package com.tcl.literal.boot;

import com.tcl.literal.things.Tea;

public class TeaRunner {

	public static void main(String[] args) {
	Tea tea= new Tea();
       System.out.println(tea.brand);
   	
       System.out.println(tea.kiloGram);
       System.out.println(tea.owner);
       System.out.println(tea.coustmerCareNo);
       System.out.println(tea.price);
       System.out.println(tea. mgfDate);
       System.out.println(tea.expDate);
       System.out.println(tea.fassiNo);
       System.out.println(tea.type);
      
        tea.profit=90f;
        System.out.println( tea.profit);
        tea.ingredient="tea";
        System.out.println(tea. ingredient);
        tea.uses="increse the blood pressure";
        System.out.println( tea.uses);
        
        tea.place="bangalore";
        
        System.out.println( tea.place);
        tea.batchNo=20125;
        System.out.println(tea.batchNo);
        tea.qrNo=12578633;
        
        System.out.println(tea.qrNo);
        tea.warning="dring dialy";
        
        System.out.println(tea.warning);
        tea. email="tea@gmail.com";
        
        System.out.println(tea. email);
	
	
	
	
	}

}
