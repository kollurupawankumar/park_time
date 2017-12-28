package com.parking.application.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

/**
 * 
 * @author kpawan
 *
 */
@Entity
public class PwVendorEntryExitSetup {
	
	private int venEnExId;
	private Date efftDt;
	private Boolean status;
	private String mobileNo;
	private String entryOrExit;
	private PwVendorAddress address;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getVenEnExId() {
		return venEnExId;
	}
	public void setVenEnExId(int venEnExId) {
		this.venEnExId = venEnExId;
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
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEntryOrExit() {
		return entryOrExit;
	}
	public void setEntryOrExit(String entryOrExit) {
		this.entryOrExit = entryOrExit;
	}
	
	@ManyToOne
	@JoinColumn(name="address_id")
	public PwVendorAddress getAddress() {
		return address;
	}
	public void setAddress(PwVendorAddress address) {
		this.address = address;
	}
	
	
	
	

}
