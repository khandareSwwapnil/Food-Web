package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
	
	List<FoodItem> findByCategory(String category);
	List<FoodItem> findByRestaurantId(Integer restaurantId);
	List<FoodItem> findByAvailable(String available);

}
