package com.educandoweb.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springcourse.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
