package com.springboottask.service; 
import java.util.List;

import com.springboottask.model.Product;
 
public interface ProductService {

public List<Product> getAllProducts();

Product getProductById(Long id);

Product createProduct(Product product);

Product updateProduct(Long id, Product product);

public void deleteProduct(Long id);
}



