package com.Mecatronique.Faissal.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.Mecatronique.Faissal.entity.MemberProject;

public interface MemberProjectRepository extends MongoRepository<MemberProject, String> {
    public long count();


}

