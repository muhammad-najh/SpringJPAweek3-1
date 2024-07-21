package com.skysoft.jpatutorial.week3_1.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "Users_test")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String sku;
    @Column(length = 100,nullable = false, unique = true,name = "name_en")
    private String name;
    @Column(length = 150,nullable = false)
    private String description;
    @Column(length = 150,nullable = false)
    private Double price;
    @CreationTimestamp
    @Column(length = 150,nullable = false, updatable = false,name = "created_at")
    private LocalDateTime created;
    @UpdateTimestamp
    @Column(length = 150,nullable = false, updatable = false, name = "updated_at")
    private LocalDateTime modified;

}