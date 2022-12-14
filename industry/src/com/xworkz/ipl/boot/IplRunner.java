package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepository;
import com.xworkz.ipl.repository.IplRepositoryImpl;

public class IplRunner {

	public static void main(String[] args) {
		IplRepository iplRepository = new IplRepositoryImpl();
		IplDTO dto = new IplDTO();

		dto.setTeamName("RCB");
		dto.setCaptainName(" Faf du Plessis");
		dto.setOwnerAlive(true);
		dto.setPurse(80);
		dto.setNoOfWins(107);
		dto.setNoOfDefeats(113);
		dto.setCreatedBy("system");
		dto.setCreatedDate(LocalDateTime.now());
		iplRepository.create(dto);
		
		
		IplDTO dto1 = new IplDTO();
		dto1.setTeamName("csk");
		dto1.setCaptainName("Ravindra Jadeja");
		dto1.setOwnerAlive(true);
		dto1.setPurse(85);
		dto1.setNoOfWins(121);
		dto1.setNoOfDefeats(86);
		dto1.setCreatedBy("system");
		dto1.setCreatedDate(LocalDateTime.now());
		iplRepository.create(dto1);

		IplDTO dto2 = new IplDTO();
		dto2.setTeamName("MI");
		dto2.setCaptainName("Rohit Sharma ");
		dto2.setOwnerAlive(true);
		dto2.setPurse(90);
		dto2.setNoOfWins(129);
		dto2.setNoOfDefeats(98);
		dto2.setCreatedBy("system");
		dto2.setCreatedDate(LocalDateTime.now());
		iplRepository.create(dto2);
		
		IplDTO dto3 = new IplDTO();
		dto3.setTeamName("RCB");
		dto3.setCaptainName(" Faf du Plessis");
		dto3.setOwnerAlive(true);
		dto3.setPurse(80);
		dto3.setNoOfWins(107);
		dto3.setNoOfDefeats(113);
		dto3.setCreatedBy("system");
		dto3.setCreatedDate(LocalDateTime.now());
		iplRepository.create(dto3);
		
		
		IplDTO dto4 = new IplDTO();
		dto4.setTeamName("DC");
		dto4.setCaptainName("  Rishabh Pant");
		dto4.setOwnerAlive(true);
		dto4.setPurse(80);
		dto4.setNoOfWins(12);
		dto4.setNoOfDefeats(4);
		dto4.setCreatedBy("system");
		dto4.setCreatedDate(LocalDateTime.now());
		iplRepository.create(dto4);
		
		IplDTO dto5 = new IplDTO();
		dto5.setTeamName("Kolkata Knight Riders");
		dto5.setCaptainName("  Shreyas Iyer");
		dto5.setOwnerAlive(true);
		dto5.setPurse(80);
		dto5.setNoOfWins(107);
		dto5.setNoOfDefeats(113);
		dto5.setCreatedBy("system");
		dto5.setCreatedDate(LocalDateTime.now());
		iplRepository.create(dto5);
		
		IplDTO dto6 = new IplDTO();
		dto6.setTeamName("Sunrisers Hyderabad");
		dto6.setCaptainName("Kane Williamson");
		dto6.setOwnerAlive(true);
		dto6.setPurse(80);
		dto6.setNoOfWins(107);
		dto6.setNoOfDefeats(113);
		dto6.setCreatedBy("system");
		dto6.setCreatedDate(LocalDateTime.now());
		iplRepository.create(dto6);
		

		IplDTO dto7 = new IplDTO();
		dto7.setTeamName("Rajasthan Royals");
		dto7.setCaptainName(" Sanju Samson");
		dto7.setOwnerAlive(true);
		dto7.setPurse(80);
		dto7.setNoOfWins(107);
		dto7.setNoOfDefeats(113);
		dto7.setCreatedBy("system");
		dto7.setCreatedDate(LocalDateTime.now());
		iplRepository.create(dto7);
		
		
		
		IplDTO dto8 = new IplDTO();
		dto8.setTeamName("Punjab Kings");
		dto8.setCaptainName(" Mayank Agarwal");
		dto8.setOwnerAlive(true);
		dto8.setPurse(80);
		dto8.setNoOfWins(107);
		dto8.setNoOfDefeats(113);
		dto8.setCreatedBy("system");
		dto8.setCreatedDate(LocalDateTime.now());
		iplRepository.create(dto8);
		
		
		IplDTO dto9 = new IplDTO();
		dto9.setTeamName("Lucknow Super Giants");
		dto9.setCaptainName(" KL Rahul");
		dto9.setOwnerAlive(true);
		dto9.setPurse(80);
		dto9.setNoOfWins(107);
		dto9.setNoOfDefeats(113);
		dto9.setCreatedBy("system");
		dto9.setCreatedDate(LocalDateTime.now());
		iplRepository.create(dto9);
		
		
	}

}
