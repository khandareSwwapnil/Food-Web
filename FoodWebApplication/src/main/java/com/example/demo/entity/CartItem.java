package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cart_Name")
@NoArgsConstructor
@AllArgsConstructor

public class CartItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long userId;
	
	private Long foodItemId;
	
	private String foodName;
	
	private Integer quantity;
	
	private Double price;
	
	private Double totalPrice;
	

}
