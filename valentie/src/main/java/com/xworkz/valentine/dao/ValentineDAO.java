package com.xworkz.valentine.dao;

import com.xworkz.valentine.entity.ValentineEntity;

public interface ValentineDAO {

	boolean save(ValentineEntity entity);

	default ValentineEntity findById(int id) {
		return null;
	}
}
