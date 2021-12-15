package com.presidio.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping(value="/customer/register")
    String getCustomerRegister(){ return "customer/register";}

    @GetMapping(value="/customer/login")
    String getCustomerLogin(){ return "customer/login";}

    @GetMapping(value="/customer/list-item")
    String getFoodItems(){ return "customer/list-item";}

    @GetMapping(value="/customer/cart")
    String getCart(){ return "customer/cart";}

}
