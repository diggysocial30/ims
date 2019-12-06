package com.ash.ims.model.vo;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Where;

import com.ash.ims.entity.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;

@javax.persistence.Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Where(clause="is_deleted='N'")
@Table(name = "user",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Builder
public class User extends AuditEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8293944260401133628L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
	
	@Column(nullable = false)
    private String email;
	
	@Column(nullable = false)
    private String password;
	
	@Column(nullable = false)
    private UserRole userRole;
    
}