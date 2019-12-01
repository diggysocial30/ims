package com.ash.ims.service.impl;

import org.springframework.stereotype.Service;

import com.ash.ims.entity.EntityType;
import com.ash.ims.service.EntityService;

@Service
public class ProductService extends BaseEntityService {

	@Override
	public EntityType getEntityType() {
		return EntityType.PRODUCT;
	}

	@Override
	public void addEntity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEntityById() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEntity() {
		// TODO Auto-generated method stub
		
	}

}
