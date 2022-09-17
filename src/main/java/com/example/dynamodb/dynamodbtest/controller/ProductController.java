package com.example.dynamodb.dynamodbtest.controller;

import com.example.dynamodb.dynamodbtest.model.Product;
import com.example.dynamodb.dynamodbtest.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public Iterable<Product>
    get(){
        Iterable<Product> all = productRepository.findAll();
        return all;
    }

    @PostMapping
    public void add(){
        productRepository.save(Product.builder().name("test").build());
    }
}
