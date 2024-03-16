package com.salascode.customer.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.salascode.customer.CustomerRegistrationRequest;
import com.salascode.customer.entity.Customer;
import com.salascode.customer.service.CustomerService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
        log.info("Registering customer: {}", customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }


    @GetMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ArrayList<Customer> getCustomers() {
        return (ArrayList<Customer>) customerService.getCustomers();
    }
    
}
