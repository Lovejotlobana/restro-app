package com.restro.restroapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Staff extends BasicInformation {
	@JsonIgnore	
	@ManyToOne
	Restaurant employer;

	public Staff(String name, String email, String contactNumber, Address address) {
		super(name, email, contactNumber, address);

	}

}
