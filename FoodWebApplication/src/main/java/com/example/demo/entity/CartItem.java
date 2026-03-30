package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cartName")
public class CartItem {
	
	private Long id;
	private Long userId;
	private Long foodId;
	private int quantity;

}
