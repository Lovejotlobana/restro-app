package com.restro.restroapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restro.restroapp.model.Order;
import com.restro.restroapp.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	Order addOrder(Order order) {
		return orderRepository.save(order);
	}
}
