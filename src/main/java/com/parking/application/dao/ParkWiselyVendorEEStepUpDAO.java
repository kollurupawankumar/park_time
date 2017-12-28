package com.parking.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.application.model.PwVendorEntryExitSetup;

@Repository
public interface ParkWiselyVendorEEStepUpDAO extends JpaRepository<PwVendorEntryExitSetup, Integer> {

}
