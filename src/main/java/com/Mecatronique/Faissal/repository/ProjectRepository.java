package com.Mecatronique.Faissal.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.Mecatronique.Faissal.entity.Project;

public interface ProjectRepository extends MongoRepository<Project, String> {

    @Query("{projectName:'?0'}")
    Project findProjectByName(String projectName);
    
    @Query(value="{category:'?0'}",fields="{'projectName' : 1, 'description' : 1, 'completion' : 1, 'startDate' : 1,'endDate' : 1}")
    List<Project> findAll(String category);
    
    public long count();

}

