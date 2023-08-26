package com.restro.restroapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restro.restroapp.model.Item;
import com.restro.restroapp.model.OrderItem;
import com.restro.restroapp.repository.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	OrderItemRepository orderItemRepository;
//	
//	OrderItem addOrderItem(Item item) {
//		
//	}
}
