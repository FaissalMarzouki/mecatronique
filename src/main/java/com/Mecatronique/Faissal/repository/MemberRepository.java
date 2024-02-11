package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Mecatronique.Faissal.entity.*;
@Repository

public interface MemberRepository extends MongoRepository<Member, String>{
    public long count();

}
