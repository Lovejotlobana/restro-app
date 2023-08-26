package com.restro.restroapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restro.restroapp.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long>{

}
