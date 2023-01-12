package com.xworkz.seasons.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class GhostCongifuration {
	public GhostCongifuration() {

		System.out.println("registering GhostCongifuration");

	}

	@Bean
	public String ghostName() {
		System.out.println("registering ghostName");
		return null;
	}

	@Bean
	public double ghostHeight() {
		System.out.println("registering ghostHeight");
		return 0.0;
	}

	@Bean
	public String ghostMotherName() {
		System.out.println("registering ghostMotherName");
		return null;
	}

	@Bean
	public String ghostFatherName() {
		System.out.println("registering ghostFatherName");
		return null;
	}

	@Bean
	public String ghostBrotherName() {
		System.out.println("registering ghostBrotherName");
		return null;
	}

	@Bean
	public String ghostSisterName() {
		System.out.println("registering ghostSisterName");
		return null;
	}

	@Bean
	public int ghostNoOFLegs() {
		System.out.println("registering ghostNoOFLegs");
		return 0;
	}

	@Bean
	public int ghostNoOFHeads() {
		System.out.println("registering ghostNoOFHeads");
		return 0;
	}

	@Bean
	public String ghostNoOfFriends() {
		System.out.println("registering ghostNoOfFriends");
		return null;
	}

	@Bean
	public int ghostIdNo() {
		System.out.println("registering ghostIdNo");
		return 0;
	}

	@Bean
	public String ghostArea() {
		System.out.println("registering ghostArea");
		return null;
	}

	@Bean
	public double ghostPhNo() {
		System.out.println("registering ghostPhNo");
		return 0.0;
	}
	@Bean
	public String ghostEducation() {
		System.out.println("registering ghostEducation");
		return null;
	}
	@Bean
	public LocalDate ghostDateOfBirth() {
		System.out.println("registering ghostDateOfBirth");
		return  LocalDate.of(0, 0, 0);
	}
	@Bean
	public LocalDate ghostDateOfDeath() {
		System.out.println("registering ghostDateOfDeath");
		return  LocalDate.of(0, 0, 0);
	}
	@Bean
	public double ghostAadhar() {
		System.out.println("registering ghostAadhar");
		return 0.0;
	}
	@Bean
	public double ghostVoterId() {
		System.out.println("registering ghostVoterId");
		return 0.0;
	}
	@Bean
	public int ghostNoOfHnads() {
		System.out.println("registering ghostNoOfHnads");
		return 0;
	}
	@Bean
	public String ghostFriendsName() {
		System.out.println("registering ghostFriendsName");
		return null;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
