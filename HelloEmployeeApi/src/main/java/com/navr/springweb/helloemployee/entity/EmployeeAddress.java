package com.navr.springweb.helloemployee.entity;

import lombok.Data;

@Data
public class EmployeeAddress {

    private String street;
    private String city;

    public EmployeeAddress() {

    }

    public EmployeeAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }
}
