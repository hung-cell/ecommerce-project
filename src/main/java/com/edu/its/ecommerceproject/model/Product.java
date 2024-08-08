package com.edu.its.ecommerceproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int productId;
    private String productName;
    private String description;
    private int price;
    private int stockQuantity;
    private String imageURL;
    private int categoryId; // Use Integer to handle null values
    private Date createdAt;

}
