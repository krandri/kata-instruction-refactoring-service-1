package com.newlight77.kata.address.model;

import lombok.Data;

@Data
public class AddressStatus {
    private String id;
    private Address address;
    private Status status;
}
