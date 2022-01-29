package com.ranufrozen.repository;

import java.util.Optional;
import com.ranufrozen.models.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String>{
	
	Optional<Product> findProductByCode(String code);
	
}
