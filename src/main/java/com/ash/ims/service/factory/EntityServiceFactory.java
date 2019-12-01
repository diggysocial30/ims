package com.ash.ims.service.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.ash.ims.entity.EntityType;
import com.ash.ims.service.EntityService;

public class EntityServiceFactory {
	
	@Autowired
    private List<EntityService> services;

    private static final Map<EntityType, EntityService> entityServiceCache = new HashMap<>();

    @PostConstruct
    public void initEntityService() {
        for(EntityService service : services) {
        	entityServiceCache.put(service.getEntityType(), service);
        }
    }

	public static EntityService getService(EntityType type) {
		EntityService service = entityServiceCache.get(type);
		if (service == null) {
			throw new RuntimeException("Unknown service type: " + type);
		}
		return service;
	}

}
