package com.example.demo.controller;


import lombok.Data;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

@Data
@Accessors(chain = true)
public class CarPO {

    private String name;

    private Timestamp createTime;

    private PersonPO person;
}
