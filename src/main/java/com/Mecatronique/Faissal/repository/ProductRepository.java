package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Mecatronique.Faissal.entity.Product;
@Repository

public interface ProductRepository extends MongoRepository<Product,String>  {
    
}
