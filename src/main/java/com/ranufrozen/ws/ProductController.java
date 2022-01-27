package com.ranufrozen.ws;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ranufrozen.models.Product;
import com.ranufrozen.services.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1/products")
@AllArgsConstructor
public class ProductController {
	private final ProductService proserv;
	
	@GetMapping
	public List<Product> fetchAllProducts(){
		// todo: nanti cari tau cara paginasi di mongodb!
		return proserv.getAllProducts();
	}
}
