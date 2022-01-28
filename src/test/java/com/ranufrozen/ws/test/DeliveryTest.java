package com.ranufrozen.ws.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ranufrozen.models.Shipping;;

class DeliveryTest {
	Shipping ship; 
	@BeforeEach
	void setUp() throws Exception {
		this.ship = new Shipping();
	}

	@Test
	void deliverySuccess() {		
		String expect = "Barang ditambahkan di keranjang";	
		String actual = this.ship.showDeliveryMsg();
		assertEquals(expect, actual);		
	}
//	# Shipping not available so delivery can be declined
	
	@Test
	void deliveryFail() {
//		ketika datang, pelanggan tak ada di rumah
//		maka kirim pesan ke pelanggan untuk mengambil barangnya sendiri		
		String shippingName = "JNT";
		String expect = "Ambil barang di depot "+shippingName;	
		String actual = this.ship.showDeliveryMsg();
		assertEquals(expect, actual);		
	}
	
}
