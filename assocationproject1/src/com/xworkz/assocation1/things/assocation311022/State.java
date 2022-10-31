package com.xworkz.assocation1.things.assocation311022;

public class State {
public String name;
public String stateCodeName;
public int noOfCities;
public String cmName;
public State(String name, String stateCodeName, int noOfCities, String cmName) {
	super();
	this.name = name;
	this.stateCodeName = stateCodeName;
	this.noOfCities = noOfCities;
	this.cmName = cmName;
}
public void  display() {
	System.out.println("name of the state"+name);
	System.out.println("stateCodeName is"+stateCodeName);
	System.out.println("noOfCities in the state"+noOfCities);
	System.out.println("cmName of the state is"+cmName);
	
	
}
}
