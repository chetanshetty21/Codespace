package com.xworkz.aeroplane.dao;

import com.xworkz.aeroplane.entity.AeroplaneEnitiy;

public interface AeroplaneDAO {
	boolean save(AeroplaneEnitiy entity);

	default AeroplaneEnitiy findById(int id) {
		return null;
	}
}
