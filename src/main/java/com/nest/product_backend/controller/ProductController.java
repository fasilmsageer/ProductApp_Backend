package com.nest.product_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping("/")
    public String welcome(){
        return "welcome to products";
    }

    @PostMapping("/add")
    public String addproduct(){
        return "welcome to add products";
    }
}
