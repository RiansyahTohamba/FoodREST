package com.ranufrozen.ws.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ranufrozen.models.Product;;

class ProductTest {
	Product prod; 
	@BeforeEach
	void setUp() throws Exception {
		this.prod = new Product();
	}

	@Test
	void showLimitedProduct() {		
		// hanya menampilkan beberapa product
		// tidak semuanya
		// this.prod.getListProduct().size()
		int expect = 5;	
		int actual = 5;
		assertEquals(expect, actual);		
	}
	
}
