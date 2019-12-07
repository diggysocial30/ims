package com.ash.ims.model.vo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Tolerate;

@javax.persistence.Entity
@Table(name = "product")
@EqualsAndHashCode(exclude = "parent")
@ToString(exclude = "parent")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Where(clause="is_deleted='N'")
public class Product extends BaseEntity {

	@Column(nullable = false)
	@ManyToMany
	private Set<SKU> sku;

	@Column(nullable = false)
	@ManyToMany
	private Set<Category> category;

	@Tolerate
	Product(){}
	
	@Builder
	private Product(Set<SKU> sku,Set<Category> category,String name,String description) {
		super(name,description);
		this.sku=sku;
		this.category=category;
	}

}
