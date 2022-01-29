# terdapat beberapa tutorial:
1. Java Techie
2. Programming with Basar
 


1. Java Techie
https://www.youtube.com/watch?v=Wa0GQwWwzJE

ga ada testcase, but ok, kita mulai dari tutorial ini saja dulu.


22 menit, apa yang sedang dilakukan?

from - to =

00:00 - 02:45 = introduce several use case of pagination such as:
1. limit data per page
2. next button
3. previous button

03:10 - 4:35 = introduce Product code such as:
1. repository/ProductRepository 
2. entity/Product
3. service/ProductService

4:35 - 6:30= introduce main application
introduce APIResponse class

6:30 = introduce function findProductsWithSorting

07:40 = introduce getProductWithSort

09:00 = introduce sorting feature based on GET paramater
GET products/pilih_field
pilih_field yang diinginkan
misalkan:
1. GET products/price
	berarti sort berdasarkan price
2. GET products/name
	berarti sort berdasarkan name


```
@GetMapping("/{field}")
private APIResponse< List<Product> > getProductsWithSort(@PathVariable String field){
	List<Product> allProducts = service.findProductsWithSorting(field);
	return new APIResponse<>(allProducts.size(), allProducts);	
}
```

11:25 - x = find product with pagination

```
public Page<Product> findProductsWithPagination(int offset, int pageSize){
	Page<Product> products = repository.findAll(PageRequest.of(offset,pageSize));
	return products;
}
```
13:09 - 
lalu loncat ke kelas main
nameApplication

```
@GetMapping("/pagination/{offset}/{pageSize}")
private APIResponse< Page<Product> > getProductsWithSort(@PathVariable int offset, @PathVariable int pageSize){
	Page<Product> productsWithPagination = service.findProductsWithPagination(offset, pageSize);
	return new APIResponse<>(productsWithPagination.getSize(), productsWithPagination);	
}
```
14:50 - 

public Page<Product> findProductsWithPagination(int offset,int pageSize){
	Page<Product> products = repository.findAll(PageRequest.of(offset,pageSize));
	return products;	
}


15:22 
GET base_url/products/pagination/offset/

16:50
ini untuk handling event pada button next page dan before page


20:00 - 22:00 = test di postman utk url: 
GET: '/products/pagination/2/50'


# jika field yg ada sudah fix,maka buat food.json, pakai apa?
	https://www.mockaroo.com/
setelah food.json sudah jadi, then import ke mongodb









2. Programming with Basar
https://youtu.be/rn-q5AmVUt4

ga ada testcase

