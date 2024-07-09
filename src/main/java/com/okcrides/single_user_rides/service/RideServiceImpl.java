package com.okcrides.single_user_rides.service;

import com.okcrides.single_user_rides.dao.RidesDao;
import com.okcrides.single_user_rides.entity.Ride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RideService{
    @Autowired
    RidesDao ridesDao;
    @Override
    public void addRide(Ride ride) {
           
    }

    @Override
    public void deleteRide(String rideId) {

    }

    @Override
    public List<Ride> getRides(String userId) {
        return null;
    }
}
