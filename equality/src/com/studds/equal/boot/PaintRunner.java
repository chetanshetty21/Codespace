package com.studds.equal.boot;

import com.studds.equal.things.Paint;

public class PaintRunner {
	public static void main(String[] args) {

		Paint paint = new Paint("asian", "Royale Atmos", 5485d, "blue", 5, true, "fsgrw564", "aug2022", "sept2035",
				586522325d);
		System.out.println(paint);
		
		Paint paint2 = new Paint("asian", "Royale Atmos", 5485d, "blue", 5, true, "fsgrw564", "aug2022", "sept2035",
				586522325d);
		System.out.println(paint2);
		boolean same =paint.equals(paint2);
		System.out.println(same);
	}

}