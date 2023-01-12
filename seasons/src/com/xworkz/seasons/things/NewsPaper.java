package com.xworkz.seasons.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class NewsPaper {
	@Autowired
	@Qualifier("NewsPaperId")
	private int id;
	private String name;
	private String ownerName;
	@Autowired
	@Qualifier("NewsPaperLang")
	private String lang;
	private int price;

	public NewsPaper(int id,@Qualifier("newspaperName") String name,@Qualifier("newspaperOwnerNmae") String ownerName, String lang, int price) {
		super();
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.lang = lang;
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", lang=" + lang + ", price="
				+ price + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getLang() {
		return lang;
	}

	public int getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	@Autowired
	@Qualifier("NewsPaperPrice")
	public void setPrice(int price) {
		this.price = price;
	}

}
