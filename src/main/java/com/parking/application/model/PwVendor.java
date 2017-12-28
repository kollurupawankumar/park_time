package com.parking.application.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;
/**
 * 
 * @author kpawan
 *
 */
@Entity
public class PwVendor {

	private int vendorId;
	private Date efftDt;
	private String name;
	private String emailId;
	private String vendorType;
	private String password;
	private Boolean corporateInd = true;
	private List<PwVendorAddress> address;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	
	@Temporal(TemporalType.DATE)
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
	
	@Type(type="yes_no")
	public Boolean getCorporateInd() {
		return corporateInd;
	}
	public void setCorporateInd(Boolean corporateInd) {
		this.corporateInd = corporateInd;
	}
	
	@OneToMany(mappedBy = "vendor", cascade = CascadeType.ALL)
	public List<PwVendorAddress> getAddress() {
		return address;
	}
	public void setAddress(List<PwVendorAddress> address) {
		this.address = address;
	}
	
	
	
	
	
}
