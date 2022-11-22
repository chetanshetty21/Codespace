package com.indianmart.heritance.boot;

import com.indianmart.heritance.custom.Document;
import com.indianmart.heritance.custom.Resume;

public class DocumentRunner {

	public static void main(String[] args) {

		Document document=new Document();
		document.read();
		//System.out.println(document.format);
		
		LandRecord landRecord=new LandRecord();
		landRecord.read();
		Resume resume=new Resume();
		//resume.read();
		//System.out.println(landRecord.format);
	}

}
