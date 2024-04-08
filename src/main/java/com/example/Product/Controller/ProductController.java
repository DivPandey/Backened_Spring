
package com.example.Product.Controller;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.models.Product;
import com.example.Product.services.ProductServices;

@RestController
public class ProductController {
    private ProductServices ps;
    public ProductController(ProductServices ps){
        this.ps=ps;
    }
    @GetMapping("/products")
    public Product[] getAllProducts(){
        return ps.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id){
        return ps.getSingleProduct(id);
    }

    
}
