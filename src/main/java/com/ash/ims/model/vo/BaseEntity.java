package com.ash.ims.model.vo;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;

@MappedSuperclass
@AllArgsConstructor
public abstract class BaseEntity extends AuditEntity {
	
	private static final long serialVersionUID = 1L;

	@Column(nullable = false, name = "name")
	private String name;
	
	@Column(nullable = false, name = "description")
	private String description;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
	
	protected BaseEntity(String name, String description) {
		this.name=name;
		this.description=description;
	}

}
