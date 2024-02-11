package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Mecatronique.Faissal.entity.Competition;
@Repository

public interface CompetitionRepository extends MongoRepository<Competition, String> {

    
} 
