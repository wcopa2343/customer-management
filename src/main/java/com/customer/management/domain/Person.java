package com.customer.management.domain;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Person {

    private Long id;

    private String name;

    private String paternalLastName;

    private String maternalLastName;

    private Direction direction;

    private LocalDate dateOfBirth;

    private String identityCard;
}
