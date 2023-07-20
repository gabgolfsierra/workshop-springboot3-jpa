package com.educandoweb.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springcourse.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
