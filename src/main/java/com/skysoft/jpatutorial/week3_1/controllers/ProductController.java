package com.skysoft.jpatutorial.week3_1.controllers;

import com.skysoft.jpatutorial.week3_1.entites.Product;
import com.skysoft.jpatutorial.week3_1.repositries.ProductRepository;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
    private final ProductRepository productRepository;
    public ProductController(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAllProducts(@RequestParam(defaultValue = "id") String sortBy) {
        return productRepository.findBy(
                Sort.by(
                        Sort.Order.asc(sortBy),
                        Sort.Order.desc("sku")
                )
        );
    }
}
