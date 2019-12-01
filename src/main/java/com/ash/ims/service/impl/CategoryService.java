package com.ash.ims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ash.ims.entity.EntityType;
import com.ash.ims.service.InventoryService;

@Service
public class CategoryService extends BaseEntityService {
	
	@Autowired
	private InventoryService inventoryService;

	@Override
	public EntityType getEntityType() {
		return EntityType.CATEGORY;
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
