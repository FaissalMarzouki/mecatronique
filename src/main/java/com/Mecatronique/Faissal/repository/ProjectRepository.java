package com.Mecatronique.Faissal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Mecatronique.Faissal.entity.Project;

@Repository
public interface ProjectRepository extends MongoRepository<Project, String> {

}

