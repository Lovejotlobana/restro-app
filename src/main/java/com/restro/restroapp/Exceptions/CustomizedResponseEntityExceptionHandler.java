package com.restro.restroapp.Exceptions;

import java.time.LocalDate;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
		ErrorDetails errorDetails = new ErrorDetails(LocalDate.now(), ex.getMessage(), request.getDescription(false));
		if (ex instanceof RestaurantNotFoundException)
		return new ResponseEntity<Object>(errorDetails, HttpStatus.NOT_FOUND);
		
		else if (ex instanceof PriceCannotBeNullException)
			return new ResponseEntity<Object>(errorDetails, HttpStatus.BAD_REQUEST);
		
		else if (ex instanceof NoSuchElementException) {
			return new ResponseEntity<Object>(errorDetails, HttpStatus.BAD_REQUEST);
		}
		else return new ResponseEntity<Object>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
