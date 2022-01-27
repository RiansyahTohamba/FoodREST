package com.ranufrozen.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Product {
	@Id
    private String price;
    private String photoPath;
    private String name;
    private int stock;
    private String desc;
    

    public Product(String price, String photoPath, String name, int stock, String desc) {
        this.price = price;
        this.photoPath = photoPath;
        this.name = name;
        this.stock = stock;
        this.desc = desc;
    }
    
    public Product() {
    	
    }
}
