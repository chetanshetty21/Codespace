package com.samsung.relationarray.country;

public class Name {
	public String oldName;
	public String newName;
	public String futurename;

	public Name(String oldName, String newName, String futurename) {
		super();
		this.oldName = oldName;
		this.newName = newName;
		this.futurename = futurename;
	}

	public void showOff() {

		System.out.println("oldnames =" + this.oldName);
		System.out.println("oldnames =" + this.newName);
		System.out.println("oldnames =" + this.futurename);

	}
}
