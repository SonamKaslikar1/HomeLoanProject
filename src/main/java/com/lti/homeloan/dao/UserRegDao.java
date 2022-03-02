package com.lti.homeloan.dao;

import com.lti.homeloan.bean.UserDetails;
import com.lti.homeloan.bean.UserLogin;
import com.lti.homeloan.bean.UserRegistration;

public interface UserRegDao {

	public abstract int saveRegisterUser(UserDetails userdts);
//	public abstract int saveLoginUser(UserDetails userdts);
//	public abstract int saveLoanTransaction(UserDetails userdts);
	public int validate(UserDetails userDtls);
	
}
