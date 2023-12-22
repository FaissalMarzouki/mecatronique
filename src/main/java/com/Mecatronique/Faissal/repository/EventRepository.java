package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.Mecatronique.Faissal.entity.*;

public interface EventRepository extends MongoRepository<Event, String>{
    @Query("{eventName:'?0'}")
    Event findProjectByName(String eventName);
}
