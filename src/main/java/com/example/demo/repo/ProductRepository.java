package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Product;

public  interface ProductRepository extends CrudRepository<Product, Long> {
    
}
