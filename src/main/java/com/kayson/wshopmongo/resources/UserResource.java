package com.kayson.wshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kayson.wshopmongo.domain.User;

//@Informa que a classe é um recurso Rest
//@Caminho do endpoint(".......s")
@RestController
@RequestMapping(value = "/users")
public class UserResource {

	// retorna uma lista de usuarios=>busca todos
	@RequestMapping(method = RequestMethod.GET)//@GetMapping
	public ResponseEntity<List<User>> findAll() {
		// objetos tipo User
		User maria = new User("1", "Maria Silva", "maria@gmail.com");
		User alex = new User("2", "Alex Santos", "alex@gmail.com");

		// lista de User's
		List<User> list = new ArrayList<>();
		// add objetos dentro de uma lista
		list.addAll(Arrays.asList(maria, alex));
		
		//
		return ResponseEntity.ok().body(list);
	}
}
