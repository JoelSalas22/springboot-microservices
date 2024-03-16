package com.salascode.customer;

public record CustomerRegistrationRequest(
    String firstName,
    String lastName,
    String email) {

    }

