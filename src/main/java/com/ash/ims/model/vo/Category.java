package com.ash.ims.model.vo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import lombok.Builder;

@Entity
@Table(name = "category")
@Where(clause = "is_deleted='N'")
public class Category extends BaseEntity {

	@Column(nullable = false)
	@ManyToMany
	private Set<Product> product;
	
	@Builder
	private Category(Set<Product> product,String name,String description) {
		super(name,description);
		this.product=product;
	}

}
