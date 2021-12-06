package com.presidio.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping
    String getIndex(){
        return "index";
    }

    @GetMapping(value="/customer/login")
    String getCustomerLogin(){ return "customer/login";}
}
