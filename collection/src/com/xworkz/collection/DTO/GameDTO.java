package com.xworkz.collection.DTO;

import java.io.Serializable;

public class GameDTO implements Serializable {
	protected String name;
	protected String type;
	protected Double noOFPlayers;

	public GameDTO() {
		// TODO Auto-generated constructor stub
	}

	public GameDTO(String name, String type, Double noOFPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.noOFPlayers = noOFPlayers;
	}

	@Override
	public String toString() {
		return "Game [name=" + name + ", type=" + type + ", noOFPlayers=" + noOFPlayers + "]";
	}

	@Override
	public boolean equals(Object game) {
		System.out.println("starting equals method");
		if (game != null) {
			if (game instanceof GameDTO) {
				GameDTO dto = (GameDTO) game;
				if (dto.name.equals(this.name)) {
					System.out.println("company name is matching");
					return true;

				}
			}

		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getNoOFPlayers() {
		return noOFPlayers;
	}

	public void setNoOFPlayers(Double noOFPlayers) {
		this.noOFPlayers = noOFPlayers;
	}
}
