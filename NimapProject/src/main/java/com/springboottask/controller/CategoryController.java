
package com.springboottask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboottask.model.Category;
import com.springboottask.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	
	@Autowired
    private CategoryService cs;
	
	@GetMapping("/getAllCategory")
	public List<Category> getAllCategories(){
		
		return cs.getAllCategories();
	}
	
	@GetMapping("/{id}")
	public Category getCategoryById(@PathVariable Long id) {
		return cs.getCategoryById(id);
	}
	
	@PostMapping("/createCategory")
    public Category CreatCategory(@RequestBody Category category){
    	return cs.createCategory(category);
    }
	
	@PutMapping("/{id}")
	public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
		return cs.updateCategory(id, category);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable Long id) {
		cs.deleteCategory(id);
	}
    
    

}
