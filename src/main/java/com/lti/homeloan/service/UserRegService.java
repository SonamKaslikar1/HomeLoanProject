package com.lti.homeloan.service;

import com.lti.homeloan.bean.LoanTransaction;
import com.lti.homeloan.bean.UserDetails;
import com.lti.homeloan.bean.UserLogin;
import com.lti.homeloan.bean.UserRegistration;

public interface UserRegService {
	
	public abstract int registerUser(UserDetails userDtls);
	
	
	
}
