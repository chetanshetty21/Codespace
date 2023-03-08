package com.xworkz.saree.dao;

import java.util.List;

import com.xworkz.saree.entity.SareeEntity;

public interface SareeDAO {
	boolean save(SareeEntity entity);

	default SareeEntity findById(int id) {
		return null;
	}

	default List<SareeEntity> findByName(String name) {
		return null;
	}

	boolean update(SareeEntity entity);

	default SareeEntity deleteById(int id) {
		return null;
	}

}
