package com.example.Product.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Product.dtos.ProductDtos;
import com.example.Product.models.Product;

@Service
public class ProductServices implements ServiceInterface{
    private RestTemplate restTemplate = new RestTemplate();
    @Override
    public Product getSingleProduct(Long id){
        ProductDtos abc = restTemplate.getForObject("https://fakestoreapi.com/products/"+id,ProductDtos.class);
        
        Product product = new Product();
        product.setId(abc.getId());
        product.setTitle(abc.getTitle());
        product.setPrice(abc.getPrice());
        product.setCategory(abc.getCategory());
        product.setDescription(abc.getDescription());
        product.setImage(abc.getImage());
        
        
        
        return product;
    }

    @Override
    public Product[] getAllProducts(){
        ResponseEntity<Product[]> response =restTemplate.getForEntity("https://fakestoreapi.com/products",Product[].class);
        Product[] allProducts = response.getBody();
        // System.out.println();
        // System.out.println();
        // System.out.println(allProducts.length);
        return allProducts;
    }

 
    
}
