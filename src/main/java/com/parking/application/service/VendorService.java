package com.parking.application.service;

import com.parking.application.model.PwVendor;

public interface VendorService {

	public String sendOTPviaMail(String email, String user);

	public boolean sendOTPviaMobile(String mobileNumber);

	public String getOTPforEmail(String email);

	public String getOTPforPhone(String phone);

	public PwVendor registerVendor(PwVendor vendor);

}
