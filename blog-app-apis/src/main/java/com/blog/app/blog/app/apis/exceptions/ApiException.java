package com.blog.app.blog.app.apis.exceptions;

public class ApiException extends RuntimeException{
    public ApiException() {
        super();
    }

    public ApiException(String message) {
        super(message);
    }
}
