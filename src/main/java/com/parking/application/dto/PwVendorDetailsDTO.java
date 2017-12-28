package com.parking.application.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.parking.application.model.PwVendorEntryExitSetup;
import com.parking.application.model.PwVendorParking;
import com.parking.application.utils.Constants;

public class PwVendorDetailsDTO {
	
	private int addressId;
	private Date efftDt;
	private Boolean status;
	private String premiseType;
	private String address1;
	private String address2;
	private String address3;
	private String country;
	private String state;
	private String city;
	private String pincode;
	private String latitude;
	private String longitude;
	
	private int twoWheelerParkingSlots;
	private double twoWheelerParkingprice;
	private int fourWheelerParkingSlots;
	private double fourWheelerParkingprice;
	
	
	private String entryMobileNo;
	private String exitMobileNo;


	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	public Date getEfftDt() {
		return efftDt;
	}


	public void setEfftDt(Date efftDt) {
		this.efftDt = efftDt;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}


	public String getPremiseType() {
		return premiseType;
	}


	public void setPremiseType(String premiseType) {
		this.premiseType = premiseType;
	}


	public String getAddress1() {
		return address1;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public String getAddress3() {
		return address3;
	}


	public void setAddress3(String address3) {
		this.address3 = address3;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	
	public int getTwoWheelerParkingSlots() {
		return twoWheelerParkingSlots;
	}


	public void setTwoWheelerParkingSlots(int twoWheelerParkingSlots) {
		this.twoWheelerParkingSlots = twoWheelerParkingSlots;
	}


	public double getTwoWheelerParkingprice() {
		return twoWheelerParkingprice;
	}


	public void setTwoWheelerParkingprice(double twoWheelerParkingprice) {
		this.twoWheelerParkingprice = twoWheelerParkingprice;
	}


	public int getFourWheelerParkingSlots() {
		return fourWheelerParkingSlots;
	}


	public void setFourWheelerParkingSlots(int fourWheelerParkingSlots) {
		this.fourWheelerParkingSlots = fourWheelerParkingSlots;
	}


	public double getFourWheelerParkingprice() {
		return fourWheelerParkingprice;
	}


	public void setFourWheelerParkingprice(double fourWheelerParkingprice) {
		this.fourWheelerParkingprice = fourWheelerParkingprice;
	}


	public String getEntryMobileNo() {
		return entryMobileNo;
	}


	public void setEntryMobileNo(String entryMobileNo) {
		this.entryMobileNo = entryMobileNo;
	}


	public String getExitMobileNo() {
		return exitMobileNo;
	}


	public void setExitMobileNo(String exitMobileNo) {
		this.exitMobileNo = exitMobileNo;
	}


	public static PwVendorParking getVendorparking(PwVendorDetailsDTO dto){
		
		PwVendorParking parking = new PwVendorParking();
		parking.setEfftDt(new Date());
		parking.setStatus(Constants.ACTIVE);
		parking.setTwoWheelerParkingSlots(dto.getTwoWheelerParkingSlots());
		parking.setTwoWheelerParkingPrice(dto.getTwoWheelerParkingprice());
		parking.setFourWheelerParkingSlots(dto.getFourWheelerParkingSlots());
		parking.setFourWheelerParkingPrice(dto.getFourWheelerParkingprice());
		return parking;
		
	}
	
	public static List<PwVendorEntryExitSetup> getEntExitSetupDetails(PwVendorDetailsDTO dto){
		List<PwVendorEntryExitSetup> result = new ArrayList<>();
		PwVendorEntryExitSetup entry = new PwVendorEntryExitSetup();
		entry.setEfftDt(new Date());
		entry.setEntryOrExit(Constants.ENTRY);
		entry.setMobileNo(dto.getEntryMobileNo());
		entry.setStatus(Constants.ACTIVE);
		result.add(entry);
		
		PwVendorEntryExitSetup exit = new PwVendorEntryExitSetup();
		exit.setEfftDt(new Date());
		exit.setEntryOrExit(Constants.ENTRY);
		exit.setMobileNo(dto.getExitMobileNo());
		exit.setStatus(Constants.ACTIVE);
		result.add(exit);
		
		return result;
	}
	
	

}
