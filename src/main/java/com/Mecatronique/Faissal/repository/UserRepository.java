package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Mecatronique.Faissal.entity.User;

public interface UserRepository extends MongoRepository<User,String> {
    
}
