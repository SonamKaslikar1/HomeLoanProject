package com.lti.homeloan.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_REGISTRATION_MST")
public class UserRegistration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "REGISTRATION_USER_MST_ID")
	private int userResId;
	@Column(name = "FIRST_NAME")
	private String firstname;
	@Column(name = "LAST_NAME")
	private String lastname;
	@Column(name = "MOBILE_NUMBER")
	private long mobileNo;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "EMAIL_ID")
	private String primaryEmail;
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "APPLICATION_NUMBER")
	private int applicationNo;
	
	public int getUserResId() {
		return userResId;
	}
	public void setUserResId(int userResId) {
		this.userResId = userResId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPrimaryEmail() {
		return primaryEmail;
	}
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(int applicationNo) {
		this.applicationNo = applicationNo;
	}
	public UserRegistration(int userResId, String firstname, String lastname, long mobileNo, String gender,
			String primaryEmail, String city, String state, int applicationNo) {
		super();
		this.userResId = userResId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.primaryEmail = primaryEmail;
		this.city = city;
		this.state = state;
		this.applicationNo = applicationNo;
	}
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserRegistration [userResId=" + userResId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", mobileNum=" + mobileNo + ", gender=" + gender + ", email=" + primaryEmail + ", city=" + city + ", state="
				+ state + ", applicationNo=" + applicationNo + "]";
	}
	
	
	
	
	

	}
