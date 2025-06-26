package com.cursojavaspring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojavaspring.course.entities.OrderItem;
import com.cursojavaspring.course.entities.pk.OrderItemPK;

/* Alterei 
 * DE: 
 * public interface OrderItemRepository extends JpaRepository <OrderItem, Long>{
 * PARA:
 */
public interface OrderItemRepository extends JpaRepository <OrderItem, OrderItemPK>{
	
	
	
}
