package com.restro.restroapp.model;



import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity 
public class Item {

	@Id
	@GeneratedValue(generator = "sequence-generator")
	private Long id;
	String name;
	boolean isVeg;
	boolean containsEgg;
	
	@NotNull
	BigDecimal price;
	boolean isActive = true;
	
	@ManyToOne 
	@JsonIgnore
	private Menu menu;
	
	public Item() {}
	
	
	
	public Item(String name, boolean isVeg, boolean containsEgg, BigDecimal price) {
		super();
		
		this.name = name;
		this.isVeg = isVeg;
		this.containsEgg = containsEgg;
		this.price = price;
		
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVeg() {
		return isVeg;
	}
	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}
	public boolean isContainsEgg() {
		return containsEgg;
	}
	public void setContainsEgg(boolean containsEgg) {
		this.containsEgg = containsEgg;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public Long getId() {
		return id;
	}
	
	
	
	public boolean isActive() {
		return isActive;
	}



	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}



	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", isVeg=" + isVeg + ", containsEgg=" + containsEgg + ", price="
				+ price + ", menu=" + menu + "]";
	}
	
	
}
