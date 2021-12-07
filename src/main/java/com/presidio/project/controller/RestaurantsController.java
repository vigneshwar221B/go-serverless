package com.presidio.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestaurantsController {
    @GetMapping
    String getIndex(){
        return "index";
    }

    @GetMapping(value="/register")
    String getRestaurantRegister(){ return "auth/register";}

    @RequestMapping(value = "/persistPerson", method = RequestMethod.POST)
    String postCreateRestaurant(){

        //TODO: success page or redirect to other url
        return "";
    }
}
