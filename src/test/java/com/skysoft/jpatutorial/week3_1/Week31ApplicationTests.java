package com.skysoft.jpatutorial.week3_1;

import com.skysoft.jpatutorial.week3_1.entites.Product;
import com.skysoft.jpatutorial.week3_1.repositries.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Week31ApplicationTests {

	@Autowired
	ProductRepository productRepository;
	@Test
	void contextLoads() {
		System.out.println("Hello World");
		List<Product> products=productRepository.findAll();
	}

	@Test
	void add(){
//		Product product=Product.builder().sku("sku1").price(100.0).name("Lenovo").description("Lenovo Core 7").build();
//		productRepository.save(product);


//		List<Product> products=productRepository.findAllById(List.of(1L,2L,3L,4L));
//		products.forEach(
//				product1 -> {
//					System.out.println(product1.getName());
//				}
//		);

//		productRepository.deleteAllInBatch(products);

		List<Product> productList=productRepository.findByNameLikeIgnoreCase("%HAMA%");
		System.out.println("test result");
		productList.forEach(product -> System.out.println(product.getName()));

	}

}
