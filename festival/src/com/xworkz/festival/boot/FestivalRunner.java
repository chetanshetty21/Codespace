package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.festival.entity.FestivalEntity;

public class FestivalRunner {
	public static void main(String[] args) {
		System.out.println("running main method for inserting data to data base");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.festival");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		FestivalEntity entity1 = new FestivalEntity("Diwali", "all india", 3, "kajaya", "lakshmi pujua");
		FestivalEntity entity2 = new FestivalEntity("thusil pooja", "AP", 1, "holige", " thusli matha");
		FestivalEntity entity3 = new FestivalEntity("Ganesh Chaturthi", "mumbai", 2, " kadabu", " ganesha");
		FestivalEntity entity4 = new FestivalEntity("holi", "Vrindavan", 1, "laddu", "krishna");
		FestivalEntity entity5 = new FestivalEntity("Navarthi", "gujarat", 9, "all sweets", "dhurga");
		FestivalEntity entity6 = new FestivalEntity("Durga Puja", "Bihar", 1, "payasa", "durga matha");
		FestivalEntity entity7 = new FestivalEntity("Dussehra", "mysore", 1, "mysore pak", " chamundi amma");
		FestivalEntity entity8 = new FestivalEntity("Janmashtami", "Mathura", 1, "gee", "krishna");
		FestivalEntity entity9 = new FestivalEntity("Maha Shivratri", "Ujjain", 1, "jilabi", "shiva");
		FestivalEntity entity10 = new FestivalEntity("Rakshabandhan", "North India", 1, "laddu", "brother");
		FestivalEntity entity11 = new FestivalEntity("Onam", "Kerala", 3, "pottu", "Kaikottikali");
		FestivalEntity entity12 = new FestivalEntity("Makar Sankranti", "kerala", 3, "aravanam", "ayyappa swami");
		FestivalEntity entity13 = new FestivalEntity("Hemis", "Ladakh", 1, "pana", "Padmasambhava");
		FestivalEntity entity14 = new FestivalEntity("Chhath Puja", "Jharkhand", 1, "bundi", "sun");
		FestivalEntity entity15 = new FestivalEntity("Gangaur", " Telangana",1,"champakali","shiva");
		FestivalEntity entity16 = new FestivalEntity("Hornbill Festival", "Nagaland", 1, "kaihobothu", "nature");
		FestivalEntity entity17 = new FestivalEntity("Saga Dawa", "Sikkim", 2, "bundi", "budda");
		FestivalEntity entity18 = new FestivalEntity("Dree Festival","Arunachal Pradesh", 1, "payasa","Ziro Valley");
		FestivalEntity entity19 = new FestivalEntity("Lui-Ngai-Ni","Manipur" , 1, "jamoon", "seed sowing festival");
		FestivalEntity entity20 = new FestivalEntity("Moatsu Mong", "Nagaland",2, "rasmali", "sowing season");
		FestivalEntity entity21 = new FestivalEntity("Onam", "Kerala", 5, "pottu", "Kaikottikali");
		FestivalEntity entity22 = new FestivalEntity("Dussehra", "mysore", 3, "loaddu", " chamundi amma");
		FestivalEntity entity23 = new FestivalEntity("Maha Shivratri", "Ujjain", 5, "peni", "shiva");
		FestivalEntity entity24 = new FestivalEntity("gowri", "mumbai", 1, "vabathu", "gowri");
		FestivalEntity entity25 = new FestivalEntity("Durga", "karanataka", 1, "payasa", "durga devi");

		transaction.begin();
		manager.persist(entity1);
		manager.persist(entity2);
		manager.persist(entity3);
		manager.persist(entity4);
		manager.persist(entity5);
		manager.persist(entity6);
		manager.persist(entity7);
		manager.persist(entity8);
		manager.persist(entity9);
		manager.persist(entity10);
		manager.persist(entity11);
		manager.persist(entity12);
		manager.persist(entity13);
		manager.persist(entity14);
		manager.persist(entity15);
		manager.persist(entity16);
		manager.persist(entity17);
		manager.persist(entity18);
		manager.persist(entity19);
		manager.persist(entity20);
		manager.persist(entity21);
		manager.persist(entity22);
		manager.persist(entity23);
		manager.persist(entity24);
		manager.persist(entity25);
		transaction.commit();
	}

}
