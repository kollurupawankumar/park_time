package com.parking.application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.parking.application.dto.PwVehicleTypeDTO;
import com.parking.application.model.PwUser;
import com.parking.application.model.PwVehicleType;
import com.parking.application.service.UserService;
import com.parking.application.service.VehicleService;

@RestController
@RequestMapping(path = "parkwisely/vehicle")
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	
	@Autowired
	UserService userService;

	

	@RequestMapping(path = "/register", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, headers = "Accept=*/*",
			produces = "application/json", method = RequestMethod.POST)
	public PwVehicleType registerVehicle(@RequestBody PwVehicleTypeDTO vehicle) {
		System.out.println("Entering into register vehicle");
		return vehicleService.registerVehicle(vehicle);
	}
	
	
	@RequestMapping(path = "/getAllVehicles", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = "application/json", method = RequestMethod.POST)
	public List<PwVehicleType> getAllVehiclesForUser(@RequestBody PwVehicleTypeDTO vehicle){
		PwUser user = userService.findUserById(vehicle.getUserId());
		if (user != null){
			return vehicleService.findAll(user);
		}else{
			return new ArrayList<>();
		}
		
	}

}
