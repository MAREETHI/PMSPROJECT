package com.capg.exception;


import java.net.http.HttpHeaders;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice

public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	
	public ResponseEntity<Exception> resourceNotFound(ResourceNotFoundException ex){
		
		Exception response=new Exception();
		response.setErrorcode("NOT_FOUND");
		response.setErrorMessage(ex.getMessage());
		response.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<Exception>(response,HttpStatus.NOT_FOUND);
		
	}
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers,HttpStatus status,WebRequest request){
		Map<String, String>errors=new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error)->{
			String fieldName=((FieldError)error).getField();
			String message=error.getDefaultMessage();
			errors.put(fieldName,message);
		});
		
		return new ResponseEntity<Object>(errors,HttpStatus.BAD_REQUEST);
	}

}
