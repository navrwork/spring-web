package com.navr.springweb.helloemployee.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfJoining;
    private String street;
    private String city;
}
