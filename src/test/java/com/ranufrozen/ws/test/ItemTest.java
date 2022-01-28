package com.ranufrozen.ws.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ranufrozen.models.Item;

class ItemTest {
	Item item; 
	@BeforeEach
	void setUp() throws Exception {
		this.item = new Item(10);
	}

	@Test
	void stockHigherThanQuantitytest() {
		int prodStock = 12;				
		String expect = "Barang ditambahkan di keranjang";	
		String actual = this.item.checkLimitBuying(prodStock);
		assertEquals(expect, actual);		
	}
	
	@Test
	void stockLowerThanQuantitytest() {
		int prodStock = 7;		
		String actual = this.item.checkLimitBuying(prodStock);
		String expect = "Barang sisa "+prodStock+", kurangi jumlah barangnya";		
		assertEquals(expect, actual);
	}
	
	void showRecommendation() {
//		menunjukkan rekomendasi yang sesuai dengan 
//		ini AI ,tidak bisa pakai unit test?
	}
}
