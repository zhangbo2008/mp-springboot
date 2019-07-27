package com.example.visit_record.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller1 {
    @RequestMapping(value = "/1", method = {RequestMethod.GET})
    public static String aa(String a) {
        return "1";
    }
}
