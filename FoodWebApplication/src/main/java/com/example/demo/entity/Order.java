package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "order")
@Data
public class Order {
	
	private Long id;
	private Long userId;
	private Double totalAmount;
	private String status;
	

}
