package com.restro.restroapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restro.restroapp.model.Menu;
import com.restro.restroapp.service.MenuService;

@RestController
@RequestMapping("/restaurant/{id}/menu")
public class MenuController {

	@Autowired
	MenuService menuService;


}

