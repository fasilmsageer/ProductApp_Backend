package com.nest.product_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/view")
    public String viewproduct(){
        return "welcome to view products";
    }

    @PostMapping("/search")
    public String searchproduct(){
        return "welcome to search products";
    }

    @PostMapping("/edit")
    public String editproduct(){
        return "welcome to edit products";
    }
}
