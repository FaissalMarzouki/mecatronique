package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Mecatronique.Faissal.entity.Sponsor;

public interface SponsorRepository extends MongoRepository<Sponsor,String> {
    
}
