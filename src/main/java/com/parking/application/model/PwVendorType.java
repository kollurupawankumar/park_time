package com.parking.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * 
 * @author kpawan
 *
 */
@Entity
public class PwVendorType {
	
	private int vendorTypeId;
	private String vendorTypeName;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getVendorTypeId() {
		return vendorTypeId;
	}
	public void setVendorTypeId(int vendorTypeId) {
		this.vendorTypeId = vendorTypeId;
	}
	public String getVendorTypeName() {
		return vendorTypeName;
	}
	public void setVendorTypeName(String vendorTypeName) {
		this.vendorTypeName = vendorTypeName;
	}
	
	

}
