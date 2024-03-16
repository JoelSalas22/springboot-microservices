package com.salascode.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salascode.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    boolean existsById(Integer id);
    
}
