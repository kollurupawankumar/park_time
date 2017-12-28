package com.parking.application.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.application.model.PwUserSurvey;

@Repository
public interface ParkWiselyUserSurveyDAO extends JpaRepository<PwUserSurvey, Integer>{

}
