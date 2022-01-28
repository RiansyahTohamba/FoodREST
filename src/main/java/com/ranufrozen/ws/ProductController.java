package com.ranufrozen.ws;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ranufrozen.models.Product;
import com.ranufrozen.services.ProductService;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;


@RestController
@RequestMapping("api/v1/products")
public class ProductController {
	private final ProductService proserv;

	String uri = "mongodb://tom:jerry@localhost";
	MongoClient client = MongoClients.create(uri);
	
	@RequestMapping("/alldb")
	public MongoIterable<String> alldb() {	
		MongoIterable<String> dbNames = this.client.listDatabaseNames();		
		return dbNames;
	}


	public ProductController() {
		this.proserv = new ProductService();
	}
	
	@GetMapping
	public List<Product> fetchAllProducts(){
		// todo: nanti cari tau cara paginasi di mongodb!
		return proserv.getAllProducts();
	}
}
