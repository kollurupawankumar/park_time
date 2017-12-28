package com.parking.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.application.model.PwState;


@Repository
public interface ParkWiselyStateDAO extends JpaRepository<PwState, Integer> {

}
