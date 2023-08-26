package com.restro.restroapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restro.restroapp.model.Customer;
import com.restro.restroapp.service.CustomerService;

@RestController
@RequestMapping("/restaurant/{id}/")
public class CustomerController {

	@Autowired
	private CustomerService customerService;


}
