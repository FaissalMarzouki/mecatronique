package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Mecatronique.Faissal.entity.Competition;

public interface CompetitionRepository extends MongoRepository<Competition, String> {

    
} 
