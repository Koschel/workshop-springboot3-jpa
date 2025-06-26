package com.cursojavaspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavaspring.course.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long>{
	
	
	
}
