package com.restro.restroapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="order_item_table")
//@Transactional
public class OrderItem {

	@Id
	@GeneratedValue(generator = "sequence-generator")
	Long id;

	int quantity;
	@ManyToOne
	Item item;
	@ManyToOne
	@JoinColumn(name="order_id")
	Order order;
	
	public OrderItem() {
	}

	public OrderItem(int quantity, Item item) {
		super();
		this.quantity = quantity;
		this.item = item;
		
	}

	public Long getId() {
		return id;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", quantity=" + quantity + "]";
	}



}
