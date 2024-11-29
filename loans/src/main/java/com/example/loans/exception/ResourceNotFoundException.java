package com.example.loans.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String resourceName, String fileName, String fieldName){
        super(String.format("%s not found with givent input data %s: %s", resourceName, fileName, fieldName));
    }
}
