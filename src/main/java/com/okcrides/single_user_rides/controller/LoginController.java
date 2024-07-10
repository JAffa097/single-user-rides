package com.okcrides.single_user_rides.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {


    @GetMapping("/loginpage")
    public String returnLoginForm(@RequestParam(value = "error", required = false) String error,@RequestParam(value = "logout", required = false) String logout, Model model){
        if (error != null) {
            model.addAttribute("errorMsg", "Invalid username or password.");
            model.addAttribute("shouldShow", true);
        }
        if (logout != null) {
            model.addAttribute("logoutMsg", "You have been logged out!!");
            model.addAttribute("shouldShow", true);
        }
        return "login";
    }
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "login";
    }
}
