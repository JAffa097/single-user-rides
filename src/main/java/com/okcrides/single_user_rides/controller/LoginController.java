package com.okcrides.single_user_rides.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {


    @GetMapping("/loginpage")
    public String returnLoginForm(){
        return "login";
    }
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "login";
    }
}
