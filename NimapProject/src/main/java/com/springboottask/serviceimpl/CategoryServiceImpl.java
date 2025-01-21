
package com.springboottask.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboottask.model.Category;
import com.springboottask.repository.CategoryRepository;
import com.springboottask.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository cr;
	
	@Override
	public List<Category> getAllCategories() {
    return cr.findAll() ;
	}

	@Override
	public Category getCategoryById(Long id) {
		 
		return cr.findById(id)
				.orElseThrow(()-> new RuntimeException("category not found"));
	}

	@Override
	public Category createCategory(Category category) {
		 
		return cr.save(category);
	}

	@Override
	public Category updateCategory(Long id, Category categoryDetails) {
		 Category category=getCategoryById(id);
		 category.setName(categoryDetails.getName());
		return cr.save(category);
	}

	@Override
	public void deleteCategory(Long id) {
		cr.deleteById(id);
		
	}
	
}

	 

	 

	 