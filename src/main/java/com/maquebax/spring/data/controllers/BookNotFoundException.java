package com.maquebax.spring.data.controllers;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException() {
        super("", new Exception());
    }
    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    // ...
}
