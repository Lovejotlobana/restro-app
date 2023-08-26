package com.restro.restroapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restro.restroapp.model.Item;
import com.restro.restroapp.service.ItemService;

@RestController
@RequestMapping("/restaurant/{restaurantId}/menu/{menuId}/item")
public class ItemController {
@Autowired
ItemService itemService;

@PostMapping("/")
Item addNewItem(@PathVariable("restaurantId") Long restaurantId,@PathVariable("menuId")  Long menuId,@RequestBody Item item) throws Exception {
	System.out.println("Controller fired!!!");
	return itemService.addNewItem(restaurantId,menuId,item);
			
}
}
