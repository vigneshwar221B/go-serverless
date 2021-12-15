package com.presidio.project.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelController {
    @GetMapping(value="/{hotel_name}/login")
    String getCustomerLogin(){ return "hotel/login";}

    @GetMapping(value="/{hotel_name}/admin")
    String getAdminPage(){ return "admin/index";}
}
