package com.parking.application.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.application.dao.ParkWiselyVendorAddressDAO;
import com.parking.application.dto.PwVendorDetailsDTO;
import com.parking.application.model.PwVendorAddress;
import com.parking.application.model.PwVendorEntryExitSetup;
import com.parking.application.model.PwVendorParking;
import com.parking.application.service.AddressService;
import com.parking.application.utils.Constants;


@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	ParkWiselyVendorAddressDAO addressDAO;

	@Override
	public boolean saveAddressDetails(PwVendorDetailsDTO detailsDTO) {
		PwVendorAddress address = new PwVendorAddress();
		List<PwVendorEntryExitSetup> entryExit = PwVendorDetailsDTO.getEntExitSetupDetails(detailsDTO);
		address.setEntryExit(entryExit);
		
		
		PwVendorParking parkingTypeDetails = PwVendorDetailsDTO.getVendorparking(detailsDTO);
		address.setParking(parkingTypeDetails);
		
		address.setAddress1(detailsDTO.getAddress1());
		address.setAddress2(detailsDTO.getAddress2());
		address.setAddress3(detailsDTO.getAddress3());
		address.setCity(detailsDTO.getCity());
		address.setCountry(detailsDTO.getCountry());
		address.setEfftDt(new Date());
		address.setLatitude(detailsDTO.getLatitude());
		address.setLongitude(detailsDTO.getLongitude());
		address.setPincode(detailsDTO.getPincode());
		address.setPremiseType(detailsDTO.getPremiseType());
		address.setStatus(Constants.ACTIVE);
		address.setState(detailsDTO.getState());
		addressDAO.save(address);
		return true;
	}

}
