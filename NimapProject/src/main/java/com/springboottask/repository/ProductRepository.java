package com.springboottask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboottask.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
 
	

}
