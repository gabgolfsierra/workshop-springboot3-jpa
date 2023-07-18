package com.educandoweb.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
