package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Mecatronique.Faissal.entity.Role;
@Repository

public interface RoleRepository extends MongoRepository<Role,String> {
    
}
