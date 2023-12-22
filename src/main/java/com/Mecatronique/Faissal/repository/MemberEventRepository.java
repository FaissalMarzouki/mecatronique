package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Mecatronique.Faissal.entity.*;

public interface MemberEventRepository extends MongoRepository<MemberEvent, String> {
    public long count();

}
