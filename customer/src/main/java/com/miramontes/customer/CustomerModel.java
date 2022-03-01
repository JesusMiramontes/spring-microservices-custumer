package com.miramontes.customer;

import lombok.*;

@Getter
@Setter
@Builder
public class CustomerModel {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
