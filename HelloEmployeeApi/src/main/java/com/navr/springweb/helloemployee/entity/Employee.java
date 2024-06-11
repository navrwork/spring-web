package com.navr.springweb.helloemployee.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfJoining;
    private EmployeeAddress address;

    public Employee() {

    }

    public Employee(Long id, String firstName, String lastName, LocalDate dateOfJoining) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfJoining = dateOfJoining;
    }
}
