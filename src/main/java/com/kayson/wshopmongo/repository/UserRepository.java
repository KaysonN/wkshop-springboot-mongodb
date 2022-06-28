package com.kayson.wshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kayson.wshopmongo.domain.User;

//indica pro spring um repository
@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
