package com.ranufrozen.ws;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.ranufrozen.models.Product;
import com.ranufrozen.models.ProductRepository;

@SpringBootApplication
public class FoodRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodRestApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(ProductRepository repo) {
		return args -> {
			repo.findProductByCode("code")
				.ifPresentOrElse(s-> System.out.println(s+ " already exists"), ()->{ 
//					jika productnya tidak ketemu, apa yg ingin dilakukan?
//					alert("product tak ketemu")
				});
		};
	}
	
	private void usingMongoTemplateAndQuery(MongoTemplate mongoTemplate) {
		Query query = new Query();
//		criteriaDefinition untuk paginasi?
//		query.addCriteria(criteriaDefinition);
		List<Product> products = mongoTemplate.find(query, Product.class);
		
	}
//	insert to mongoDB
	/*
	 * @Bean
	CommandLineRunner runner(ProductRepository repo) {
		return args -> {
			Product product = new Product(getPostParamater());
			repo.insert(product);
		};
	}
	 */
}
