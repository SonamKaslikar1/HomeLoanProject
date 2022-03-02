package com.lti.homeloan.bean;


public class UserDetails {

	
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
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public int getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(int loanAmt) {
		this.loanAmt = loanAmt;
	}
	public int getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	public int getUr() {
		return ur;
	}
	public void setUr(int ur) {
		this.ur = ur;
	}
	public String getLoanTypeId() {
		return loanTypeId;
	}
	public void setLoanTypeId(String loanTypeId) {
		this.loanTypeId = loanTypeId;
	}
	public String getFormName() {
		return formName;
	}
	public void setFormName(String formName) {
		this.formName = formName;
	}
	private String firstname;
	private String lastname;
	private long mobileNo;
	private String gender;
	private String primaryEmail;
	private String city;
	private String state;
	private int loanAmt;
	private int loanTenure;
	private String password;
	private String userRole;
	private String loanTypeId;
	private int ur;
	private String formName;
}
