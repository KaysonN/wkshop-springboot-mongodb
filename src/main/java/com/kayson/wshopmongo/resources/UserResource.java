package com.kayson.wshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kayson.wshopmongo.domain.User;
import com.kayson.wshopmongo.services.UserService;

//@Informa que a classe é um recurso Rest
//@Caminho do endpoint(".......s")
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;

	// retorna uma lista de usuarios=>busca todos
	@RequestMapping(method = RequestMethod.GET) // @GetMapping
	public ResponseEntity<List<User>> findAll() {

		// lista de User's
		List<User> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}
}
