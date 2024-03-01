package com.Mecatronique.Faissal.repository;

import com.Mecatronique.Faissal.entity.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Mecatronique.Faissal.entity.User;

import java.util.Optional;

@Repository

public interface UserRepository extends MongoRepository<User,String> {
    Optional<User> findByEmail(String email);
    User findByRole(Role role);

}
