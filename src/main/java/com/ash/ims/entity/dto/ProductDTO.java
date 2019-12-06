package com.ash.ims.entity.dto;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDTO extends BaseEntityDTO{

	ProductDTO(String name, String description, UUID id) {
		super(name, description, id);
	}

}
