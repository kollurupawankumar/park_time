package com.parking.application.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class PwVendorParking {
	
	private int parkingId;
	private Date efftDt;
	private Boolean status;
	private int twoWheelerParkingSlots;
	private double twoWheelerParkingPrice;
	private int fourWheelerParkingSlots;
	private double fourWheelerParkingPrice;
	private PwVendorAddress address;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getParkingId() {
		return parkingId;
	}
	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getEfftDt() {
		return efftDt;
	}
	public void setEfftDt(Date efftDt) {
		this.efftDt = efftDt;
	}
	
	public int getTwoWheelerParkingSlots() {
		return twoWheelerParkingSlots;
	}
	public void setTwoWheelerParkingSlots(int twoWheelerParkingSlots) {
		this.twoWheelerParkingSlots = twoWheelerParkingSlots;
	}
	public double getTwoWheelerParkingPrice() {
		return twoWheelerParkingPrice;
	}
	public void setTwoWheelerParkingPrice(double twoWheelerParkingPrice) {
		this.twoWheelerParkingPrice = twoWheelerParkingPrice;
	}
	public int getFourWheelerParkingSlots() {
		return fourWheelerParkingSlots;
	}
	public void setFourWheelerParkingSlots(int fourWheelerParkingSlots) {
		this.fourWheelerParkingSlots = fourWheelerParkingSlots;
	}
	public double getFourWheelerParkingPrice() {
		return fourWheelerParkingPrice;
	}
	public void setFourWheelerParkingPrice(double fourWheelerParkingPrice) {
		this.fourWheelerParkingPrice = fourWheelerParkingPrice;
	}
	@Type(type="yes_no")
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	@OneToOne
	@JoinColumn(name="address_id")
	public PwVendorAddress getAddress() {
		return address;
	}
	public void setAddress(PwVendorAddress address) {
		this.address = address;
	}
	
	
	

}
