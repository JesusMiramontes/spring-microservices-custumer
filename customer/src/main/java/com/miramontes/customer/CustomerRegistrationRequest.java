package com.miramontes.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
){}
