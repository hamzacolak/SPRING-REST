package org.springjavaconfig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springjavaconfig.entities.MainCategory;


public interface MainCategoryDao extends JpaRepository<MainCategory, Integer>{

}
