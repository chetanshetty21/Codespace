package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired
	@Qualifier("HardwareShopIdNO")
	protected int idNo;
	@Autowired
	@Qualifier("HardwareShopName")
	protected String name;
	@Autowired
	@Qualifier("HardwareShopGstNo")
	protected double gstNo;
	@Autowired
	@Qualifier("HardwareShopOwnerName")
	protected String ownerName;
	@Autowired
	@Qualifier("HardwareShopAdress")
	protected String adress;

	public HardwareShop(int idNo, String name, double gstNo, String ownerName, String adress) {
		super();
		this.idNo = idNo;
		this.name = name;
		this.gstNo = gstNo;
		this.ownerName = ownerName;
		this.adress = adress;
	}

	public int getIdNo() {
		return idNo;
	}

	public String getName() {
		return name;
	}

	public double getGstNo() {
		return gstNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getAdress() {
		return adress;
	}

	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGstNo(double gstNo) {
		this.gstNo = gstNo;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
