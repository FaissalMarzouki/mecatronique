package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Mecatronique.Faissal.entity.Sponsor;
@Repository

public interface SponsorRepository extends MongoRepository<Sponsor,String> {
    
}
