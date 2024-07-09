package com.okcrides.single_user_rides.dao;

import com.okcrides.single_user_rides.entity.Ride;

import java.util.List;

public interface RidesDao {

    public void addRide(Ride ride);
    public List<Ride> getRides(String userId);
    public void deleteRide(String userId);
}
