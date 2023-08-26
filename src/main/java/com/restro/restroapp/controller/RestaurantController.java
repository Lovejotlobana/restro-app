package com.restro.restroapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restro.restroapp.Exceptions.RestaurantNotFoundException;
import com.restro.restroapp.model.Customer;
import com.restro.restroapp.model.Menu;
import com.restro.restroapp.model.Restaurant;
import com.restro.restroapp.model.Staff;
import com.restro.restroapp.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	@Autowired
	RestaurantService restaurantService;

	@GetMapping("/all")
	List<Restaurant> getAllRestaurants() {
		return restaurantService.getAllRestaurants();
	}

	@GetMapping("/{id}")
	Restaurant getRestaurantDetails(@PathVariable("id") Long id) throws Exception {
		Restaurant restaurant = restaurantService.getRestaurantDetails(id);

		if (restaurant == null) {
			throw new RestaurantNotFoundException("No restaurant found");
		} else
			return restaurant;
	}

	@GetMapping("/{id}/staff")
	List<Staff> getAllStaff(@PathVariable("id") Long id) {
		return restaurantService.getAllStaff(id);
	}

	@GetMapping("/{id}/customers")
	List<Customer> getAllCustomers(@PathVariable("id") Long id) {
		return restaurantService.getAllCustomers(id);
	}
	
	@GetMapping("/{id}/menu")
	List<Menu> getRestaurantMenu(@PathVariable("id") Long id) {
		return restaurantService.getRestaurantMenu(id);
	}

	@PostMapping("/")
	Restaurant createNewRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.createNewRestaurant(restaurant);
	}

}
