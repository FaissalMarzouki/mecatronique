package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Mecatronique.Faissal.entity.*;

public interface MemberRepository extends MongoRepository<Member, String>{
    public long count();

}
