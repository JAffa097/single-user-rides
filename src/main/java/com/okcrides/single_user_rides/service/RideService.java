package com.okcrides.single_user_rides.service;


import com.okcrides.single_user_rides.entity.Ride;

import java.util.List;

public interface RideService {
    public void addRide(Ride ride);
    public void deleteRide(String rideId );
    public List<Ride> getRides(String userId);
}
