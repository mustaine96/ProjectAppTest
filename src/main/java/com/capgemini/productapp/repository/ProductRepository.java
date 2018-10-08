package com.capgemini.productapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.productapp.entity.Product;
import com.capgemini.productapp.exception.ProductNotFoundException;

public interface ProductRepository extends JpaRepository<Product, Integer>{


}
