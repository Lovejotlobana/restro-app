package com.restro.restroapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restro.restroapp.model.Menu;
import com.restro.restroapp.repository.MenuRepository;

@Service
public class MenuService {
@Autowired
MenuRepository menuRepository;

	public Menu getRestaurantMenu(Long id) {
		return menuRepository.findById(id).orElse(null);
	}
	
	

}
