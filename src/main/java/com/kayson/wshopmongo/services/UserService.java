package com.kayson.wshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kayson.wshopmongo.domain.User;
import com.kayson.wshopmongo.repository.UserRepository;

//indica pro spring um service
@Service
public class UserService {

	//o spring procura a definição do objeto instanciado com a anotation @Autowired
	@Autowired
	UserRepository repository;
	
	//responsavel por retornar todos usuarios do BD
	public List<User> findAll(){
		return repository.findAll();
	}
}
