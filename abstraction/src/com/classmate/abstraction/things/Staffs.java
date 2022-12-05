package com.classmate.abstraction.things;

import com.classmate.abstraction.rules.BMRCL;

public class Staffs {
	private BMRCL bmrcl;

	public Staffs(BMRCL bmrcl) {
		this.bmrcl = bmrcl;
		System.out.println("it is parameterzied cont");
	}

	public Staffs() {
		System.out.println("it is ha default const");
	}

	public void checkStaffs(){
		System.out.println("checking for null");
		if (this.bmrcl!=null)	{
			float Staffs =this.bmrcl.BMRCLStation();
			if(Staffs>0 ) {
				System.out.println("station is crt");
				
			}
		}else {
			System.out.println("station is not correct");
		}
	}

}
