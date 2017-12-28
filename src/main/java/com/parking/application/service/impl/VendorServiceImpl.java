package com.parking.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.application.dao.ParkWiselyOtpInformationDAO;
import com.parking.application.dao.ParkWiselyVendorDAO;
import com.parking.application.model.PwOtpInformation;
import com.parking.application.model.PwVendor;
import com.parking.application.service.VendorService;
import com.parking.application.utils.CommonUtil;
import com.parking.application.utils.SendMail;


@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	ParkWiselyVendorDAO pwVendorDAO;
	
	@Autowired
	ParkWiselyOtpInformationDAO pwOtpinfo;

	@Override
	public String sendOTPviaMail(String email, String user) {
		String getOtp = CommonUtil.generatePIN();
		boolean status = SendMail.sendEmail(email, user, getOtp);
		if (status) {
			PwOtpInformation entity = new PwOtpInformation();
			entity.setEmail(email);
			entity.setOtp(getOtp);
			pwOtpinfo.saveAndFlush(entity);
			if (entity.getOtpId() != 0) {
				return "Successfully send the OTP to the emailId...";
			}

		}
		return "Error while send the email. Please enter vaild email Address";
	}

	@Override
	public boolean sendOTPviaMobile(String mobileNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getOTPforEmail(String email) {

		List<PwOtpInformation> list = pwOtpinfo.findByEmail(email);
		if (list.size() != 0){
			return list.get(0).getOtp();
		}
		return "error";
	}

	@Override
	public String getOTPforPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PwVendor registerVendor(PwVendor vendor) {
		return pwVendorDAO.save(vendor);
	}

}
