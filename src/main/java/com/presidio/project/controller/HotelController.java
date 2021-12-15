package com.presidio.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HotelController {
    @GetMapping(value="/login")
    String getCustomerLogin(){ return "hotel/login";}

    @GetMapping(value="/admin")
    String getAdminPage(){ return "admin/index";}

    @GetMapping(value="/change-password")
    String getChangePassword(){ return "auth/change-password";}
}
