package com.xworkz.spring.things;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired
	@Qualifier("SoftwareName")
	protected String name;
	@Autowired
	@Qualifier("SoftwareVersion")
	protected Double version;
	@Autowired
	@Qualifier("SoftwareDeveloper")
	protected String developer;
	@Autowired
	@Qualifier("SoftwareLocalDate")
	protected Double LocalDate;
	@Autowired
	@Qualifier("SoftwareFree")
	protected boolean free;

	public Software(String name, Double version, String developer, Double localDate, boolean free) {
		super();
		this.name = name;
		this.version = version;
		this.developer = developer;
		LocalDate = localDate;
		this.free = free;
	}

	public String getName() {
		return name;
	}

	public Double getVersion() {
		return version;
	}

	public String getDeveloper() {
		return developer;
	}

	public Double getLocalDate() {
		return LocalDate;
	}

	public boolean isFree() {
		return free;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVersion(Double version) {
		this.version = version;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public void setLocalDate(Double localDate) {
		LocalDate = localDate;
	}

	public void setFree(boolean free) {
		this.free = free;
	}
}
