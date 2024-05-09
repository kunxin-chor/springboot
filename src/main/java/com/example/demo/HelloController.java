package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Product;
import com.example.demo.services.ProductService;



@RestController
public class HelloController {

    @Autowired
    private ProductService productServices;

    @GetMapping("/")
    public Map<String, String> hello(){
        return Map.of("message", "hello world again");
    }

    @GetMapping("/products")
    public Iterable<Product> products() {
        return productServices.getAllProducts();
    }
}
