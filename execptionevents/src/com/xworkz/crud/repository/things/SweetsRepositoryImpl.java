package com.xworkz.crud.repository.things;

import com.xworkz.crud.repository.bridge.EmailRepository;
import com.xworkz.crud.repository.bridge.SweetsNameRepository;
import com.xworkz.crud.repository.events.SweetsSizeExceededexception;

public class SweetsRepositoryImpl implements SweetsNameRepository {
	
		private String[] sweets = new String[10];
		private int sweetsIndex = 0;

		
		@Override
		public boolean create(String sweets) {
			System.out.println("running create sweets repo...");
			if(this.sweetsIndex > this.sweets.length) 
			{
				throw new SweetsSizeExceededexception();
			}
			this.sweets[sweetsIndex] = sweets;
			this.sweetsIndex++;
			return false;
		}
		@Override
		public int totalSweets() {
			// TODO Auto-generated method stub
			return SweetsNameRepository.super.totalSweets();
		}
}

