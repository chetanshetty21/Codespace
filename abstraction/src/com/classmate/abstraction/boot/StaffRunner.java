package com.classmate.abstraction.boot;

import com.classmate.abstraction.obeys.MetroStaff;
import com.classmate.abstraction.rules.BMRCL;
import com.classmate.abstraction.things.Staffs;

public class StaffRunner {

	public static void main(String[] args) {
		BMRCL bmrcl=new MetroStaff();
		Staffs staffs=new Staffs(bmrcl);
		staffs.checkStaffs();
		staffs=new Staffs();
	}

}
