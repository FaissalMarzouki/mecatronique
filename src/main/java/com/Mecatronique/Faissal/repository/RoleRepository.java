package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Mecatronique.Faissal.entity.Role;

public interface RoleRepository extends MongoRepository<Role,String> {
    
}
