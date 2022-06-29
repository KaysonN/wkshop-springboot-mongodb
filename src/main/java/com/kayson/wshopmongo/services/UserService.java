package com.kayson.wshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.kayson.wshopmongo.domain.User;
import com.kayson.wshopmongo.dto.UserDTO;
import com.kayson.wshopmongo.repository.UserRepository;
import com.kayson.wshopmongo.services.exception.ObjectNotFoundException;

//indica pro spring um service
@Service
public class UserService {

	// o spring procura a definição do objeto instanciado com a anotation @Autowired
	@Autowired
	UserRepository repository;

	// responsavel por retornar todos usuarios do BD
	public List<User> findAll() {
		return repository.findAll();
	}

	// responsavel por retornas UM usuario
	public User findById(String id) {
		Optional<User> user = repository.findById(id);

		if (user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado!");
		}
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public User insert(User user) {
		return repository.save(user);
	}

	public User fromDTO(UserDTO userDTO) {
		return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
	}

	public void delete(String id) {
		// Faz uma busca, caso não encontre nenhum objeto, retorna uma exception
		findById(id);
		// se encontrar o objeto passado como parametro, ele deleta do banco.
		repository.deleteById(id);

	}

}
