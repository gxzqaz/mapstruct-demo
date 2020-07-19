package com.example.demo.controller;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

/**
 * @author aze
 */
@RestController
public class TestController {

    @Autowired
    private CarConvert carConvert;

    @GetMapping("/test1")
    public Object test1(){
        val po = new CarPO().setCreateTime(new Timestamp(System.currentTimeMillis())).setName("hello");
        return carConvert.po2Dto(po);
    }
}
