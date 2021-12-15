package com.presidio.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagerController {
    @GetMapping(value="/add-cooks")
    String getAddCooks(){ return "manager/add-cooks";}

    @GetMapping(value="/add-food")
    String getAddFood(){ return "manager/add-food";}
}
