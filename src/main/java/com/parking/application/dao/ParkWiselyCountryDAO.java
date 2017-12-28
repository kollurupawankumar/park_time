package com.parking.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.application.model.PwCountry;

@Repository
public interface ParkWiselyCountryDAO extends JpaRepository<PwCountry, Integer> {

}
