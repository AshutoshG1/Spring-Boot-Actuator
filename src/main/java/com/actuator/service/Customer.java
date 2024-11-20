package com.actuator.service;

import org.springframework.stereotype.Component;

@Component
public class Customer {

    Customer(){
        System.out.println("Creating the bean of Customer ");
    }
}

