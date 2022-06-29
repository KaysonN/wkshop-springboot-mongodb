package com.kayson.wshopmongo.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.kayson.wshopmongo.services.exception.ObjectNotFoundException;

//indica que a classe é responsavel por tratar erros nas requisições
@ControllerAdvice
public class ResourceExceptionHandler {

	// identifica a exceção
	@ExceptionHandler(ObjectNotFoundException.class) // tipo exceção / exigência
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {

		HttpStatus status = HttpStatus.NOT_FOUND;

		StandardError standardError = new StandardError(System.currentTimeMillis(), status.value(), "Não encontrado",
				e.getMessage(), request.getRequestURI());

		return ResponseEntity.status(status).body(standardError);
	}
}
