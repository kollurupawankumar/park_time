package com.parking.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.application.model.PwVendorParking;

@Repository
public interface ParkWiselyVendorParkingDAO extends JpaRepository<PwVendorParking, Integer> {

}
