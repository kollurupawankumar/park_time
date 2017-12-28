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
public class PwState {

	private int stateId;
	private Date efftDt;
	private Boolean status;
	private String stateName;
	private PwCountry country;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
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

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@ManyToOne
	@JoinColumn(name = "country_id")
	public PwCountry getCountry() {
		return country;
	}

	public void setCountry(PwCountry country) {
		this.country = country;
	}

}
