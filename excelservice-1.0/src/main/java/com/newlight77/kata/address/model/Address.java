package com.newlight77.kata.address.model;

import lombok.Data;

@Data
public class Address {
    private String id;
    private String streetNumber;
    private String streetName;
    private String postalCode;
    private String city;
}
