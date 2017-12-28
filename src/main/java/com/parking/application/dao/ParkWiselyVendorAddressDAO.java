package com.parking.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.application.model.PwVendorAddress;

@Repository
public interface ParkWiselyVendorAddressDAO extends JpaRepository<PwVendorAddress,Integer>{

}
