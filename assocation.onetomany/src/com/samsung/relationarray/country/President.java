package com.samsung.relationarray.country;

import com.samsung.relationarray.contants.Gender;

public class President {
	public String name;
	public double tenure=5;
	public long totalVotes;
	public Gender gender;
	public President(String name) {
		super();
		this.name = name;
	}
	public void setGender(Gender gender) {
		this .gender=gender;
	}
	public void setTotalVotes(long totalVotes ) {
		this.totalVotes=totalVotes;
		
	}
	public void details() {
		System.out.println(this.name);
		System.out.println(this.tenure);
		System.out.println(this.totalVotes);
		System.out.println(this.gender);	
	}

}
