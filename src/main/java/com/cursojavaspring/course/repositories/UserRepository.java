package com.cursojavaspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavaspring.course.entities.User;

public interface UserRepository extends JpaRepository <User, Long>{
	
	
	
}
