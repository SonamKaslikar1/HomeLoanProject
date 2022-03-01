package com.lti.homeloan.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "USER_LOGIN_MST")
public class UserLogin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_LOGIN_MST_ID")
	private int userId;

	@Column(name = "USER_PASSWORD")
	private String userPassword;

	@Column(name = "USER_ROLE")
	private String userRole;

	
	 @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)	 
	 @JoinColumn(name="REGISTRATION_USER_MST_ID") 
	// @Column(name ="REGISTRATION_USER_MST_ID")
	 private UserRegistration ur ;
	 

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public UserRegistration getUr() {
		return ur;
	}

	public void setUr(UserRegistration ur) {
		this.ur = ur;
	}

	public UserLogin(int userId, String userPassword, String userRole, UserRegistration ur) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.userRole = userRole;
		this.ur = ur;
	}

	public UserLogin() {
		super();
	} // TODO Auto-generated constructor stub }

	@Override
	public String toString() {
		return "UserLogin [userId=" + userId + ", userPassword=" + userPassword + ", userRole=" + userRole + ", ur="
				+ ur + "]";
	}

}
