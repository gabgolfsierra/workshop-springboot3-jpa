package com.educandoweb.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springcourse.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
