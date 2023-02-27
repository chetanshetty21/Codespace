package com.xworkz.saree.dao;

import com.xworkz.saree.entity.SareeEntity;

public interface SareeDAO {
	boolean save(SareeEntity entity);

	default SareeEntity findById(int id) {
		return null;
	}
}
