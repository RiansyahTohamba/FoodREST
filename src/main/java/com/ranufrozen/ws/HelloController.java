package com.ranufrozen.ws;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.ranufrozen.models.Product;

import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//org.springframework.web ?
// kenapa springframework tak ada org.springframework.web nya?

@RestController
public class HelloController {
	String uri = "mongodb://tom:jerry@localhost";
	MongoClient client = MongoClients.create(uri);
	
	@RequestMapping("/hello")
	public String hello() {
//		siapa yang cetakk String hai?
		return "hai";
	}
	@RequestMapping("/alldb")
	public MongoIterable<String> alldb() {	
		MongoIterable<String> dbNames = this.client.listDatabaseNames();		
		return dbNames;
	}


}
