package com.LibrarySystem.management.Exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
    	super(message);
    }
}
