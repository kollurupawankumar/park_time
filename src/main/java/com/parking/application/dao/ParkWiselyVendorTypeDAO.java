package com.parking.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.application.model.PwVendorType;

@Repository
public interface ParkWiselyVendorTypeDAO extends JpaRepository<PwVendorType, Integer> {

}
