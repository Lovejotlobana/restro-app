package com.restro.restroapp.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(code =HttpStatus.NOT_FOUND)
public class RestaurantNotFoundException extends RuntimeException{
	public RestaurantNotFoundException(String message){
		super(message);
	}
}
