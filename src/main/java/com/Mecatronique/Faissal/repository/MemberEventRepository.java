package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Mecatronique.Faissal.entity.*;
@Repository

public interface MemberEventRepository extends MongoRepository<MemberEvent, String> {
    public long count();

}
