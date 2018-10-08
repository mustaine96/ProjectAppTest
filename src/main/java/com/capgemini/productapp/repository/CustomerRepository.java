package com.capgemini.productapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.productapp.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
