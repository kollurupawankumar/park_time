package com.parking.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.parking.application.dto.PwUserDTO;
import com.parking.application.model.PwUser;
import com.parking.application.service.UserService;

@RestController
@RequestMapping(path = "parkwisely/user")
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(path = "/sendOTP", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, headers = "Accept=*/*",
			produces = "application/json", method = RequestMethod.POST)
	public String sendOTP(@RequestBody PwUserDTO user) {
		System.out.println("Entering into sendOTP");
		return userService.sendOTPviaMail(user.getEmailId(), user.getFirstName());
	}

	@RequestMapping(path = "/register", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, headers = "Accept=*/*",
			produces = "application/json", method = RequestMethod.POST)
	public PwUser registerUser(@RequestBody PwUserDTO user) {
		System.out.println("Entering into register user");
		String checkOtp = userService.getOTPforEmail(user.getEmailId());
		System.out.println("otp value :"+checkOtp);
		if (checkOtp != null && user.getOtp() != null && user.getOtp().equalsIgnoreCase(checkOtp)) {
			PwUser pwUser =  PwUserDTO.generateModelUser(user);
			return userService.registerUser(pwUser);
		}else{
			System.out.println("Invalid otp");
		    return null;	
		}
	}
	
	
	
	

}
