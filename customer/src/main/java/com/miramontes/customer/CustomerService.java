package com.miramontes.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {
        CustomerModel customer = CustomerModel.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email()).build();

        // todo: validate if email is valid
        // todo: validate email is not taken
        // todo: store customer in db
    }
}
