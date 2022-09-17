package com.example.dynamodb.dynamodbtest.repositories;

import com.example.dynamodb.dynamodbtest.model.Product;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableScan
@Repository
public interface ProductRepository extends CrudRepository<Product, String> {

    Optional<Product> findById(String id);
}
