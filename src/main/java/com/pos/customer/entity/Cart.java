package com.pos.customer.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="carts")
public class Cart{
	@Id @GeneratedValue @Column(name="cart_id")
	private Long id;
	
	@Column(nullable=false)
	private String status;
	
	@OneToOne @JoinColumn(name="customer_id",nullable=false)
	private Customer customer;
	
	@OneToMany(mappedBy="cart")
	private List<CartItem> cartItems;
}
