package com.presidio.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KitchenController {
    @GetMapping(value="/orders")
    String getCustomerLogin(){ return "kitchen/orders";}

    @GetMapping(value="/manage-food")
    String getAdminPage(){ return "kitchen/manage-food";}
}
