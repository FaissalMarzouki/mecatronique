package com.Mecatronique.Faissal.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Mecatronique.Faissal.entity.MemberProject;
@Repository

public interface MemberProjectRepository extends MongoRepository<MemberProject, String> {
    public long count();


}

