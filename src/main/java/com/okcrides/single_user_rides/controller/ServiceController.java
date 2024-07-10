package com.okcrides.single_user_rides.controller;

import com.okcrides.single_user_rides.entity.Ride;
import com.okcrides.single_user_rides.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ServiceController {

    @Autowired
    private RideService rideService;
    @PostMapping("/addRide/submit")
    public void addRide(){

    }
    @GetMapping("/")
    public String homePage(){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = ((UserDetails)authentication.getPrincipal()).getUsername();

               return "home-page";
    }
    @GetMapping("/add-ride")
    public String addRide1(Model model){
       Ride ride= new Ride();
        model.addAttribute("ride", ride);
        return "add-ride";
    }
}
