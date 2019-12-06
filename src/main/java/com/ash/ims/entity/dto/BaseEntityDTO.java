package com.ash.ims.entity.dto;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseEntityDTO {
	
	private String name;
	
	private String description;

	private UUID id;

}
