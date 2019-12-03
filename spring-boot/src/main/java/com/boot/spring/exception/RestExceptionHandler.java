package com.boot.spring.exception;

import javax.validation.ConstraintViolationException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler({ BookNotFoundException.class })
	protected ResponseEntity<Object> handleNotFound(Exception exception, WebRequest request) {
		return handleExceptionInternal(exception, "Book Not Found", new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}

	@ExceptionHandler({ BookIdMismatchException.class, ConstraintViolationException.class,
			DataIntegrityViolationException.class })
	protected ResponseEntity<Object> handleIdMismatch(Exception exception, WebRequest request) {
		return handleExceptionInternal(exception, exception.getLocalizedMessage(), new HttpHeaders(),
				HttpStatus.BAD_REQUEST, request);
	}
}
