package com.ash.ims.service;

import com.ash.ims.entity.EntityType;

public interface EntityService {

	EntityType getEntityType();
	
	void addEntity();
	
	void getEntityById();

	void updateEntity();

}
