package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Mecatronique.Faissal.entity.Image;

@Repository
public interface ImageRepository extends MongoRepository<Image, String> {
}
