
package com.springboottask.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboottask.model.Category;
import com.springboottask.model.Product;
import com.springboottask.repository.ProductRepository;
import com.springboottask.service.CategoryService;
import com.springboottask.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository pr;
	
	@Autowired
	private CategoryService cs;

	@Override
	public Product getProductById(Long id) {
	 
		return pr.findById(id)
				.orElseThrow(()-> new RuntimeException("Product not found"));
	}

	@Override
	public List<Product> getAllProducts() {
	 
		return pr.findAll();
	}

	@Override
	public Product createProduct(Product product) {
		 Category category= cs.getCategoryById(product.getCategory().getId());
		 product.setCategory(category);
		return pr.save(product);
	}

	@Override
	public Product updateProduct(Long id, Product productDetails) {
		Product product=getProductById(id);
		product.setName(productDetails.getName());
		product.setPrice(productDetails.getPrice());
		product.setCategory(productDetails.getCategory());
		return pr.save(product);
	}

	@Override
	public void deleteProduct(Long id) {
		 pr.deleteById(id);
		
	}

	 
	
	 

}
