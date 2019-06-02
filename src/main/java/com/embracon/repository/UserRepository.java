package com.embracon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.embracon.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
