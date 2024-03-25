package com.customer.management.adapter.out.persistence.entity;
import jakarta.persistence.Embeddable;


@Embeddable
public class Direction {
    private String geographicLocation;
    private String street;
    private String numberAddress;

}
