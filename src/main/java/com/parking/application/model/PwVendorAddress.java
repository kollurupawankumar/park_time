package com.parking.application.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

/**
 * 
 * @author kpawan
 *
 */
@Entity
public class PwVendorAddress {
	
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
	private PwVendor vendor;
	private PwVendorParking parking;
	private List<PwVendorEntryExitSetup> entryExit;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getEfftDt() {
		return efftDt;
	}
	public void setEfftDt(Date efftDt) {
		this.efftDt = efftDt;
	}
	
	@Type(type="yes_no")
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
	
	@ManyToOne
	@JoinColumn(name="vendor_id")
	public PwVendor getVendor() {
		return vendor;
	}
	public void setVendor(PwVendor vendor) {
		this.vendor = vendor;
	}
	
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
	public PwVendorParking getParking() {
		return parking;
	}
	public void setParking(PwVendorParking parking) {
		this.parking = parking;
	}
	
	@OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
	public List<PwVendorEntryExitSetup> getEntryExit() {
		return entryExit;
	}
	public void setEntryExit(List<PwVendorEntryExitSetup> entryExit) {
		this.entryExit = entryExit;
	}
	
	
	
	
	
	
	

}
