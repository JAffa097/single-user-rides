package com.okcrides.single_user_rides.controller;

import com.okcrides.single_user_rides.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceController {

    @Autowired
    private RideService rideService;
    @GetMapping("/addRide/submit")
    public void addRide(){

    }
}
