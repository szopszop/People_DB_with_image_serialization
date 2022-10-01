package com.example.peopledbdb.biz.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@AllArgsConstructor
public class Person {
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private BigDecimal salary;



}
