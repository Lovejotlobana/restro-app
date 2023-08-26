package com.restro.restroapp.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer extends BasicInformation {
	@JsonIgnore
	@ManyToOne
	Restaurant restaurant;
	
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	List<Order> orders = new ArrayList<Order>();
	public Customer(String name, String email, String contactNumber, Address address) {
		super(name, email, contactNumber, address);

	}

}
