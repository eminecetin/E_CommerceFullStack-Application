package com.archis.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="product_name")
    private String productName;

    @Column(name="photo_url")
    private String photoUrl;

    @Column(name="price")
    private double price;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;
}
