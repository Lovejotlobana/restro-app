package com.restro.restroapp.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;

//import java.util.ArrayList;
//import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "RESTAURANT_TABLE")
public class Restaurant extends BasicInformation {



	@OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	List<Customer> customer = new ArrayList<Customer>();

	@OneToMany(mappedBy = "employer", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	List<Staff> staff = new ArrayList<Staff>();
	
	@OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
	List<Menu> menu =  new ArrayList<Menu>();
	
	public Restaurant(String name, String email, String contactNumber, Address address) {
		super(name, email, contactNumber, address);

	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public List<Staff> getStaff() {
		return staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

	
	
	@Override
	public String toString() {
		return "Restaurant [customer=" + customer + ", staff=" + staff + "]";
	}

	public List<Menu> getMenu() {
		return menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}

	

}
