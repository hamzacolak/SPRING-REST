package org.springjavaconfig.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springjavaconfig.core.entity.BaseEntity;

@Entity
@Table(name = "tbl_sub_Category")
public class SubCategory extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Size(min = 3, max = 15, message = "{subCategory.name.size}")
	@NotEmpty(message = "{subCategory.name.empty}")
	@Column(name="NAME")
	private String name;


	@ManyToOne(targetEntity=MainCategory.class)
	@JoinColumn(name="MAIN_CATEGORY_ID",referencedColumnName="ID")
	private MainCategory mainCategory;
	
	/********************************/
	public MainCategory getMainCategory() {
		return mainCategory;
	}

	public void setMainCategory(MainCategory mainCategory) {
		this.mainCategory = mainCategory;
	}

	/*********************************************/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
