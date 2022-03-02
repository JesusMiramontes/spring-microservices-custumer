package com.miramontes.customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerRegistrationRequest{

    private String firstName;
    private String lastName;
    private String email;

    public CustomerRegistrationRequest() {}

    public CustomerRegistrationRequest(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
