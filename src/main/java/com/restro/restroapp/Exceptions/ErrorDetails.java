package com.restro.restroapp.Exceptions;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class ErrorDetails {

 private LocalDate timestamp;
 private String message;
 private String details;
 
 
}
