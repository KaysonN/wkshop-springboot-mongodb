package com.kayson.wshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kayson.wshopmongo.domain.Post;

//indica pro spring um repository
@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
