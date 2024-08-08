package com.edu.its.ecommerceproject.controller;


import com.edu.its.ecommerceproject.mappers.ProductMapper;
import com.edu.its.ecommerceproject.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private ProductMapper productMapper;

    @GetMapping("/products")
    public List<Product> test() {
        return productMapper.findAll();
    }
}
