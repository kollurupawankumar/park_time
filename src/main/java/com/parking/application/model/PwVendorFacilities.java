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
public class PwVendorFacilities {

	private int facilityId;
	private Date efftDt;
	private Boolean status;
	private String facilityType;
	private String facilityName;
	private PwVendorAddress address;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
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
	public String getFacilityType() {
		return facilityType;
	}
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
	public String getFacilityName() {
		return facilityName;
	}
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
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
