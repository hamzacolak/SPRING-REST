package org.springjavaconfig.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springjavaconfig.entities.SubCategory;


public interface SubCategoryDao extends JpaRepository<SubCategory,Integer>{

	@Query("SELECT p FROM SubCategory p where p.mainCategory.id=:mainCategoryId")
	public List<SubCategory> getListByMainCategoryId(@Param("mainCategoryId") Long  mainCategoryId);
	
}