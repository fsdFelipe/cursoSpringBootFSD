package com.app.controllers.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.app.services.exceptions.DataIntegrityException;
import com.app.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler{

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> ObjectNotFound (ObjectNotFoundException e,
			HttpServletRequest request){
		StandardError erro = new StandardError(HttpStatus.NOT_FOUND.value(),
				e.getMessage(), System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
	@ExceptionHandler(DataIntegrityException.class)
	public ResponseEntity<StandardError> dataIntegrity (DataIntegrityException e,
			HttpServletRequest request){
		StandardError erro = new StandardError(HttpStatus.BAD_REQUEST.value(),
				e.getMessage(), System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
	}
}
