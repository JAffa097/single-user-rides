package com.okcrides.single_user_rides.dao;


import com.okcrides.single_user_rides.entity.Ride;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RidesDaoImpl implements  RidesDao{

   // @Autowired
  // EntityManager entityManager;

    @Override
    public void addRide(Ride ride) {

    }

    @Override
    public List<Ride> getRides(String userId) {
        return null;
    }

    @Override
    public void deleteRide(String userId) {

    }
}
