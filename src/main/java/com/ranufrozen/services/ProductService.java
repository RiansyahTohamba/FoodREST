package com.ranufrozen.services;

import org.springframework.stereotype.Service; 
import com.ranufrozen.models.Product;
import com.ranufrozen.models.ProductRepository;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import com.ranufrozen.models.Product;

// kenapa @AllArgsConstructor belum bisa recover error final prodRepo dari eclipse?
// eclipse belum menyesuaikan diri
@Service
public class ProductService {	
	private ProductRepository prodRepo;

	public ProductService() {
						
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return prodRepo.findAll();
	}

	public static void initFake() {
		ConcurrentMap<Integer,Product> Product;
		// TODO Auto-generated method stub
//       new ConcurrentHashMap<>();
//      key = new AtomicInteger();
//      this.addProduct(new Product());
	      Product pr1 = new Product(
	          "Rp 40.000", "breakfast_item.jpg", "Nugget Asam Manis", 100, "Asam Manis enak-enak"
	      ); 
	      Product pr2 = new Product(
	          "Rp 20.000", "lunch_item.jpg", "Nugget Karage", 0, "Karage enak-enak"
	      ); 
	      Product pr3 = new Product(
	          "Rp 55.000", "lunch_item.jpg", "Nugget Sayap", 0, "Sayap enak-enak"
	      );
	}


    // example data
    // price: 'Rp 30.000',
    // photoPath: 'breakfast_item.jpg',
    // name: 'Nugget Asam Manis',
    // stock: 4,
    // desc: 'Rasa asam manis'

}
