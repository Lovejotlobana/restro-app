package com.restro.restroapp.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restro.restroapp.model.Customer;
import com.restro.restroapp.model.Menu;
import com.restro.restroapp.model.Restaurant;
import com.restro.restroapp.model.Staff;
import com.restro.restroapp.repository.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepository;

	public Restaurant getRestaurantDetails(Long id) {
		return restaurantRepository.findById(id).orElse(null);
	}

	public Restaurant createNewRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	public List<Restaurant> getAllRestaurants() {
		return restaurantRepository.findAll();
	}

	public List<Staff> getAllStaff(Long id) {
		Restaurant r = restaurantRepository.findById(id).orElse(null);
		if (r == null)
			throw new NoSuchElementException("Error fetching restauant details");
		return r.getStaff();

	}

	public List<Customer> getAllCustomers(Long id) {
		Restaurant r = restaurantRepository.findById(id).orElse(null);
		if (r == null)
			throw new NoSuchElementException("Error fetching restauant details");
		return r.getCustomer();
	}

	public List<Menu> getRestaurantMenu(Long id) {
		Restaurant r = restaurantRepository.findById(id).orElse(null);
		if (r == null)
			throw new NoSuchElementException("Error fetching restauant details");
		return r.getMenu();
	}



}
