package com.example.Product.dtos;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class ProductDtos {
    private Long id;
    private String title;
    private String description;
    private String category;
    private String image;
    private double price;

}
