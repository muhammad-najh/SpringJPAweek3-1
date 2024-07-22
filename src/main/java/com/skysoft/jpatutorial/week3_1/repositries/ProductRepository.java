package com.skysoft.jpatutorial.week3_1.repositries;

import com.skysoft.jpatutorial.week3_1.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByName(String name);
    List<Product> findByNameAndPrice(String name, Double price);
    List<Product> findByPriceBetween(Double lower, Double higher);
    void deleteProductByName(String name);
    void deleteProductByNameAndPrice(String name, Double price);
    List<Product> findByNameContainingIgnoreCase(String name);
    List<Product> findByNameLikeIgnoreCase(String name);
}
