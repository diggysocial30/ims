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
@Table(name = "sku")
@EqualsAndHashCode(exclude = "parent")
@ToString(exclude = "parent")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Where(clause="is_deleted='N'")
@Builder
public class SKU extends BaseEntity {

	@Column(nullable = false, name = "name")
	private String name;
	
	@Column(nullable = false, name = "description")
	private String description;
	
	@Column(nullable = false, name = "stock")
	private Long stock;
	
	@Column(nullable = false, name = "price")
	private double price;
	
	@Column(nullable = false, name = "size")
	private Long size;
	
	@Column(nullable = false)
	@ManyToMany
	private Set<Product> product;

	@Tolerate
	public SKU() {
	}

}
