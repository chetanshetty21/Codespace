package com.xworkz.industry.boot;

import com.xworkz.industry.dto.TerriostDTO;
import com.xworkz.industry.service.TerriostService;
import com.xworkz.industry.service.TerriostServiceImpl;
public class TerriostRunner {

	public static void main(String[] args) {
 TerriostDTO dto=new TerriostDTO("kisaczs", 8, "paksitan", false, false, "gdcgfc");

	System.out.println(dto);
	TerriostService service=new TerriostServiceImpl() ;
		service.validateAndSave(dto);
		
	}

}