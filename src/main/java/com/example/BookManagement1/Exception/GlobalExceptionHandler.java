package com.example.BookManagement1.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<Object> exceptionHandling(CustomException ce){
		return new ResponseEntity<Object>(ce.getErrorMsg(), HttpStatus.BAD_REQUEST);
	}

}
