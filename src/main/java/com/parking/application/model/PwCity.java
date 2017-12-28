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
public class PwCity {

	private int cityId;
	private Date efftDt;
	private Boolean status;
	private String cityName;
	private PwCountry country;
	private PwState state;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
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

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@ManyToOne
	@JoinColumn(name = "country_id")
	public PwCountry getCountry() {
		return country;
	}

	public void setCountry(PwCountry country) {
		this.country = country;
	}

	@ManyToOne
	@JoinColumn(name = "state_id")
	public PwState getState() {
		return state;
	}

	public void setState(PwState state) {
		this.state = state;
	}

}
