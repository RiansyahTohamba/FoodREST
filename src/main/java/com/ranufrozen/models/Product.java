package com.ranufrozen.models;
import java.util.List;

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
    
    public Product() {}
    
    public Product(String price, String photoPath, String name, int stock, String desc) {
        this.price = price;
        this.photoPath = photoPath;
        this.name = name;
        this.stock = stock;
        this.desc = desc;
    }
/*
    public String chooseDelivery(Cart cart){
        for (Item item : cart.getItems()) {
            // limit buying nya saja dulu, baru check yang lain            
            if (this.checkLimitofBuying(prodBought) == false) {
                // jika ada yang fail langsung kirim sinyal                                
            }
                                
        }
        // berarti checkLimitofBuying() harus return false/true 
    }
*/    
 
    
//    
    public void countSalesRanking() {
//    	ketika user melakukan buy pada suatu product 
//    	maka ranking nya harus diubah
//    	ini masih bisa dilakukan di layer database?
//    	after create Transaction, then countSalesRanking
    }
    
    public void addToWishList() {
    	
    }
    
//    user minta berapa params?
    public List<Product> getProductPagination(){
    	return null;
    }

    public int getProductId() {
        return 10;
    }

    public int getStock() {
        return this.stock;
    }
    
    
}
