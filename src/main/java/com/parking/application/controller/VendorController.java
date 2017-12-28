package com.parking.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.parking.application.dto.PwVendorDTO;
import com.parking.application.dto.PwVendorDetailsDTO;
import com.parking.application.http.PwResponse;
import com.parking.application.model.PwVendor;
import com.parking.application.service.AddressService;
import com.parking.application.service.VendorService;

@RestController
@RequestMapping(path = "parkwisely/vendor")
public class VendorController {
	
	@Autowired
	VendorService vendorService;
	
	@Autowired
	AddressService addressService;

	@RequestMapping(path = "/sendOTP", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, headers = "Accept=*/*",
			produces = "application/json", method = RequestMethod.POST)
	public String sendOTP(@RequestBody PwVendor vendor) {
		System.out.println("Entering into sendOTP");
		return vendorService.sendOTPviaMail(vendor.getEmailId(), vendor.getName());
	}

	@RequestMapping(path = "/register", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, headers = "Accept=*/*",
			produces = "application/json", method = RequestMethod.POST)
	public PwVendor registerVendor(@RequestBody PwVendorDTO vendor) {
		System.out.println("Entering into register vendor");
		String checkOtp = vendorService.getOTPforEmail(vendor.getEmailId());
		System.out.println("otp value :"+checkOtp);
		if (checkOtp != null && vendor.getOtp() != null && vendor.getOtp().equalsIgnoreCase(checkOtp)) {
			PwVendor pwVendor = PwVendorDTO.convertToVendorType(vendor);
			return vendorService.registerVendor(pwVendor);
		}else{
			System.out.println("Invalid otp");
		    return null;	
		}
	}
	
	@RequestMapping(path = "/register/address", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, headers = "Accept=*/*",
			produces = "application/json", method = RequestMethod.POST)
	public PwResponse registerVendorAddress(@RequestBody PwVendorDetailsDTO vendor) {
		PwResponse resp = new PwResponse();
		try{
			addressService.saveAddressDetails(vendor);
			resp.setMessage("Successfully added the address details");
			resp.setStatus("success");
		}catch (Exception e) {
			resp.setMessage("failed in adding the address details : "+e.getMessage());
			resp.setStatus("failed");
		}
		return resp;
	}

}
