package com.presidio.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping(value="/customer/register")
    String getCustomerLogin(){ return "customer/register";}
}
