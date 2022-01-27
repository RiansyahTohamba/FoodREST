package com.ranufrozen.models;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String>{
	
	Optional<Product> findProductByCode(String code);
	
}
