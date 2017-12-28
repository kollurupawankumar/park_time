package com.parking.application.dto;

import java.util.Date;

import com.parking.application.model.PwVendor;

public class PwVendorDTO {
	
	private int vendorId;
	private Date efftDt;
	private String name;
	private String emailId;
	private String vendorType;
	private String password;
	private Boolean corporateInd = true;
	private String otp;
	private String token;
	
	
	
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public Date getEfftDt() {
		return efftDt;
	}
	public void setEfftDt(Date efftDt) {
		this.efftDt = efftDt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getVendorType() {
		return vendorType;
	}
	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getCorporateInd() {
		return corporateInd;
	}
	public void setCorporateInd(Boolean corporateInd) {
		this.corporateInd = corporateInd;
	}
	
	
	
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public static PwVendor convertToVendorType(PwVendorDTO dto){
		PwVendor type = new PwVendor();
		type.setCorporateInd(dto.getCorporateInd());
		type.setEfftDt(dto.getEfftDt());
		type.setEmailId(dto.getEmailId());
		type.setName(dto.getName());
		type.setPassword(dto.getPassword());
		type.setVendorType(dto.getVendorType());
		return type;
	}
	

}
