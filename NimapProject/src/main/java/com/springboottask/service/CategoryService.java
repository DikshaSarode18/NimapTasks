package com.springboottask.service;

import java.util.List;

import com.springboottask.model.Category;

public interface CategoryService {
	
    Category getCategoryById(Long id);

	Category createCategory(Category category);

	Category updateCategory(Long id, Category category);

	void deleteCategory(Long id);

	public List<Category> getAllCategories();

}
