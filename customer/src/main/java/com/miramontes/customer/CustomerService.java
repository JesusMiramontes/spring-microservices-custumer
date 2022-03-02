package com.miramontes.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public void registerCustomer(CustomerRegistrationRequest request) {
        CustomerModel customer = CustomerModel.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .build();

        // todo: validate if email is valid
        // todo: validate email is not taken
        // todo: store customer in db
    }
}
