package org.springjavaconfig.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springjavaconfig.core.entity.BaseEntity;

@Entity
@Table(name = "tbl_main_category")
public class MainCategory extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Size(min = 3, max = 10, message = "{mainCategory.name.size}")
	@NotEmpty(message = "{mainCategory.name.empty}")
	@Column(name="NAME")
	private String name;
	
	
	public String getName() {
		return name;
	}

	public MainCategory() {
		// TODO Auto-generated constructor stub
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
