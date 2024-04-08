package com.example.Product.services;

import com.example.Product.models.Product;

public interface ServiceInterface {
    Product getSingleProduct(Long id);
    Product[] getAllProducts();
   
}
