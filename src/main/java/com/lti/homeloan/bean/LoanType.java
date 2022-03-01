
package com.lti.homeloan.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "LOAN_TYPE_MST")
public class LoanType {

	@Id
	@Column(name = "LOAN_TYPE_ID")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int loanTypeId;

	@Column(name = "LOAN_TYPE_NAME")
	private String loanTypeName;

	public String getLoanTypeName() {
		return loanTypeName;
	}

	public void setLoanTypeName(String loanTypeName) {
		this.loanTypeName = loanTypeName;
	}

	public int getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(int loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public LoanType(String loanTypeName, int loanTypeId) {
		super();
		this.loanTypeName = loanTypeName;
		this.loanTypeId = loanTypeId;
	}

	public LoanType() { super(); }// TODO Auto-generated constructor stub }

	@Override
	public String toString() {
		return "LoanType [loanTypeName=" + loanTypeName + ", loanTypeId=" + loanTypeId + "]";
	}

}
