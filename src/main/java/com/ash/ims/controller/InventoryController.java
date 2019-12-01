package com.ash.ims.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ash.ims.entity.EntityType;
import com.ash.ims.service.EntityService;
import com.ash.ims.service.factory.EntityServiceFactory;

@RestController
@RequestMapping("/api/ims")
public class InventoryController {
	
	    @GetMapping("/v1/{entityType}")
	    public  Map<String, List<Map<String, String>>> getEntity(@PathVariable("entityType") String entityType) throws Exception {
	    	EntityService uploadService = EntityServiceFactory.getService(EntityType.fromValue(entityType));
	    	uploadService.getEntityById();
			return null;
	    }
	    
	    @PostMapping("/v1/{entityType}")
	    public  Map<String, List<Map<String, String>>> postEntity(@PathVariable("entityType") String entityType) throws Exception {
	    	EntityService uploadService = EntityServiceFactory.getService(EntityType.fromValue(entityType));
	    	uploadService.addEntity();
	    	return null;
	    }
	    
	    @PutMapping("/v1/{entityType}")
	    public  Map<String, List<Map<String, String>>> putEntity(@PathVariable("entityType") String entityType) throws Exception{
	    	EntityService uploadService = EntityServiceFactory.getService(EntityType.fromValue(entityType));
	    	uploadService.updateEntity();
			return null;
	    }


}
