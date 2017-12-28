package com.parking.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.application.model.PwVendorFacilities;

@Repository
public interface ParkWiselyVendorFacilitiesDAO extends JpaRepository<PwVendorFacilities, Integer> {

}
