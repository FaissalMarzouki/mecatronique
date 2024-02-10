package com.Mecatronique.Faissal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Mecatronique.Faissal.entity.Product;

public interface ProductRepository extends MongoRepository<Product,String>  {
    
}
