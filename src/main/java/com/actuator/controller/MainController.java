package com.actuator.controller;

import com.actuator.service.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/main")
public class MainController {

    @Autowired
    private Customer customer;

    @GetMapping("/getData")
    public Map<String,String> getData(){
        return Map.of("Name", "Ashutosh");
    }
}
