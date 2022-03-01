
package com.lti.homeloan.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "LOAN_TRANSACTION_MST")
public class LoanTransaction {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "LOAN_TRANSACTION_MST_ID")
	private int loanTransactionId;

	@Column(name = "LOAN_AMT")
	private double loanAmount;

	@Column(name = "TENURE")
	private float tenure;

	@Column(name = "APPLICATION_STATUS")
	private String appStatus;

	@Column(name = "APPROVED_BY")
	private String approvedBy;

	@Column(name = "REMARKS")
	private String Remarks;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)	 
	 @JoinColumn(name="REGISTRATION_USER_MST_ID") 
	 private UserRegistration ur ;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)	 
	 @JoinColumn(name="LOAN_TYPE_ID") 
	 private LoanType loanType ;


	public LoanType getLoanType() {
		return loanType;
	}

	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}


	/*
	 * public UserRegistration getUr() { return ur; }
	 * 
	 * public void setUr(UserRegistration ur) { this.ur = ur; }
	 */

	
	public int getLoanTransactionId() {
		return loanTransactionId;
	}

	public void setLoanTransactionId(int loanTransactionId) {
		this.loanTransactionId = loanTransactionId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public float getTenure() {
		return tenure;
	}

	public void setTenure(float tenure) {
		this.tenure = tenure;
	}

	

	public LoanTransaction(int loanTransactionId, double loanAmount, float tenure, String appStatus, String approvedBy,
			String remarks, UserRegistration ur, String loanTypeId) {
		super();
		this.loanTransactionId = loanTransactionId;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
		this.appStatus = appStatus;
		this.approvedBy = approvedBy;
		Remarks = remarks;
		//this.ur = ur;
		
	}

	public UserRegistration getUr() {
		return ur;
	}

	public void setUr(UserRegistration ur) {
		this.ur = ur;
	}

	public LoanTransaction() {
		super();
	}

	@Override
	public String toString() {
		return "LoanTransaction [loanTransactionId=" + loanTransactionId + ", loanAmount=" + loanAmount + ", tenure="
				+ tenure + ", appStatus=" + appStatus + ", approvedBy=" + approvedBy + ", Remarks=" + Remarks + ", ur="
				+   ", loanTypeId="  + "]";
	}

	

}
