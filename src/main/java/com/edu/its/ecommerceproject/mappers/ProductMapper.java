package com.edu.its.ecommerceproject.mappers;

import com.edu.its.ecommerceproject.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {
    @Select("SELECT ProductID, ProductName, Description, Price, StockQuantity, ImageURL, CategoryID, CreatedAt FROM products")
    List<Product> findAll();

}
