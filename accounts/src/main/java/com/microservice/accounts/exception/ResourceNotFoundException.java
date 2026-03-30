package com.microservice.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
		// as it takes only single value, so based on all parameters we will construct a
		// single value
		super(String.format("%s not found with the given input data %s: '%s'", resourceName, fieldName, fieldValue));
	}

}
