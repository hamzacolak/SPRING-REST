package org.springjavaconfig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springjavaconfig.dao.MainCategoryDao;
import org.springjavaconfig.entities.MainCategory;



@Service
@Transactional
public class MainCategoryService {

	@Autowired
	private MainCategoryDao mainCategoryDao;

	public void delete(MainCategory mainCategory) {
		mainCategoryDao.delete(mainCategory);
	}
	

	public void delete(int id) {
		mainCategoryDao.delete(id);
	}
	
	public void save(MainCategory mainCategory)
	{
		mainCategoryDao.save(mainCategory);
	}
	
	public List<MainCategory> getList(){
		return mainCategoryDao.findAll();
	}
	
	public MainCategory getMainCategoryById(int id) {
		return mainCategoryDao.findOne(id);
	}
}
