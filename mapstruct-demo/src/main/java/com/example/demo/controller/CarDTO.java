package com.example.demo.controller;


import lombok.Data;

import java.sql.Timestamp;

@Data
public class CarDTO {

    private String name;

    private Timestamp createTime;

    private PersonDTO person;
}
