package com.parking.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.application.model.PwVendor;

@Repository
public interface ParkWiselyVendorDAO extends JpaRepository<PwVendor, Integer> {

}
