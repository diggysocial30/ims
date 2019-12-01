package com.ash.ims.model.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Tolerate;

@javax.persistence.Entity
@Table(name = "product")
@EqualsAndHashCode(exclude = "parent")
@ToString(exclude = "parent")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Where(clause="is_deleted='N'")
@Data
@Builder
public class Product extends AuditEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "parent", cascade=CascadeType.REMOVE, orphanRemoval = true)
    private List<SKU> children = new ArrayList<SKU>();

    @Tolerate
    public Product(){}

}
