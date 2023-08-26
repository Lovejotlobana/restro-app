package com.restro.restroapp.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Menu {
	
	@Id
	@GeneratedValue(generator = "sequence-generator")
	private Long id;
	@OneToMany(mappedBy="menu",cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	List<Item> items = new ArrayList<Item>();
	boolean isActive = true;
	
	@ManyToOne
	@JsonIgnore
	Restaurant restaurant;
	
	public Menu() {}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Menu(List<Item> items,Restaurant restaurant  ) {
		super();
		this.restaurant = restaurant;
		this.items = items;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Long getId() {
		return id;
	}
	
	
	
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", items=" + items + ", isActive=" + isActive + "]";
	}

	
}
