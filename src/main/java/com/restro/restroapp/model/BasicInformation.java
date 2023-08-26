package com.restro.restroapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter @Setter @NoArgsConstructor
public class BasicInformation {
	@Id
	@GeneratedValue(generator = "sequence-generator")
	Long id;
	String name;
	String email;
	String contactNumber;
	Address address;
	public BasicInformation(String name, String email, String contactNumber, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	@Override
	public String toString() {
		return "BasicInformation [id=" + id + ", name=" + name + ", email=" + email + ", contactNumber=" + contactNumber
				+ ", address=" + address + "]";
	}
	
	
	
}
