package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.Mecatronique.Faissal.entity.*;
@Repository

public interface EventRepository extends MongoRepository<Event, String>{
    @Query("{eventName:'?0'}")
    Event findProjectByName(String eventName);
}
