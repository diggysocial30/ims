package com.ash.ims.dao.service;

import java.util.UUID;

import com.ash.ims.model.vo.Product;

public interface EntityDAOService<T> {

	T save(T product);
	Product get(UUID id);
	void update(T product);

}
