package com.skysoft.jpatutorial.week3_1.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(
        schema = "schema_products",
        name = "Products",
        uniqueConstraints = {
                @UniqueConstraint(name = "price_name_cons", columnNames = {"name_en","price"}),
                @UniqueConstraint(name = "name_cons", columnNames = "name_en")
        },
        indexes ={
                @Index(name = "index1",columnList = "sku,name_en")
        }
)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
    @Column(length = 150,name = "created_at")
    private LocalDateTime created;
    @UpdateTimestamp
    @Column(length = 150,  name = "updated_at")
    private LocalDateTime modified;

}
