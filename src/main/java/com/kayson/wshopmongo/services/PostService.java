package com.kayson.wshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kayson.wshopmongo.domain.Post;
import com.kayson.wshopmongo.repository.PostRepository;
import com.kayson.wshopmongo.services.exception.ObjectNotFoundException;

//indica pro spring um service
@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}