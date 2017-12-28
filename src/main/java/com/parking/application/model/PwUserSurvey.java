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


/**
 * 
 * @author kpawan
 *
 */
@Entity
public class PwUserSurvey {
	
	private int surveyId;
	private Date surveyDate;
	private int ratings;
	private String comments;
	private PwVendorAddress address;
	private PwUser user;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getSurveyDate() {
		return surveyDate;
	}
	public void setSurveyDate(Date surveyDate) {
		this.surveyDate = surveyDate;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	@ManyToOne
	@JoinColumn(name="address_id")
	public PwVendorAddress getAddress() {
		return address;
	}
	public void setAddress(PwVendorAddress address) {
		this.address = address;
	}
	
	@ManyToOne
	@JoinColumn(name="user_id")
	public PwUser getUser() {
		return user;
	}
	public void setUser(PwUser user) {
		this.user = user;
	}
	
	
	
	
	
	
	
	

}
