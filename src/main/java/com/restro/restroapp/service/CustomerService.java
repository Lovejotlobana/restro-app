package com.restro.restroapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restro.restroapp.model.Customer;
import com.restro.restroapp.model.Restaurant;
import com.restro.restroapp.repository.CustomerRepository;
import com.restro.restroapp.repository.RestaurantRepository;
@Service
public class CustomerService {

@Autowired
private CustomerRepository customerRepository;
@Autowired
private RestaurantRepository restaurantRepository;
	public List<Customer> fetchAllRestaurantCustomers(Long id) {
		
		Restaurant	restaurant = 	restaurantRepository.findById(id).orElse(null);
		if (restaurant != null) {
			return restaurant.getCustomer();
		}
		else
			return  null;
	}

}
