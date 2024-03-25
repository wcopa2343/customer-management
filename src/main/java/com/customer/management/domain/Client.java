package com.customer.management.domain;

import com.customer.management.adapter.out.persistence.entity.PersonEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {

    private Long id;

    private String email;

    private String phone;

    private String occupation;

    private int age;

    private PersonEntity personEntity;

    private String uniqueIdentifier;

    private String status;
}
