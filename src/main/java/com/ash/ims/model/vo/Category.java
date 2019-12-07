package com.ash.ims.model.vo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import lombok.Builder;
import lombok.experimental.Tolerate;

@Entity
@Table(name = "category")
@Where(clause = "is_deleted='N'")
@Builder
public class Category extends BaseEntity {

	@Column(nullable = false)
	@ManyToMany
	private Set<Product> product;
	
	@Tolerate
	Category(){}
	
	
}
