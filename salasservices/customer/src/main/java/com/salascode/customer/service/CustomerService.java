package com.salascode.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.salascode.customer.CustomerRegistrationRequest;
import com.salascode.customer.entity.Customer;
import com.salascode.customer.repository.CustomerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
        .firstName(request.firstName())
        .lastName(request.lastName())
        .email(request.email())
        .build();

        // TODO: Check if email is valid
       
        // TODO: Check if email is already taken
        
        // TODO: Store customer in database
        customerRepository.saveAndFlush(customer);
    } 


    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }


    
    
}
