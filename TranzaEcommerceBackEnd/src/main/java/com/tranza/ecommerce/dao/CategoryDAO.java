package com.tranza.ecommerce.dao;

import java.util.List;

import com.tranza.ecommerce.model.Category;

public interface CategoryDAO {

	Category getCategoryById(int categoryId);

	boolean addCategory(Category category);

	boolean updateCategory(Category category);

	boolean deleteCategory(Category category);

	// Method to fetch list of category
	List<Category> getAllCategory();

	
	//Add more methods
	// GFet active category
	//public List<Category> getActiveCategory();

}
