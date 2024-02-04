package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Mecatronique.Faissal.entity.Application;

public interface ApplicationRepository extends MongoRepository<Application,String>{

    
}
