package com.lti.homeloan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.homeloan.bean.LoanTransaction;
import com.lti.homeloan.bean.LoanType;
import com.lti.homeloan.bean.UserDetails;
import com.lti.homeloan.bean.UserLogin;
import com.lti.homeloan.bean.UserRegistration;

@Repository
public class UserRegDaoImpl implements UserRegDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int saveRegisterUser(UserDetails userdtl) {
		UserRegistration ur = new UserRegistration();
		ur.setFirstname(userdtl.getFirstname());
		ur.setLastname(userdtl.getLastname());
		ur.setGender(userdtl.getGender());
		ur.setMobileNo(userdtl.getMobileNo());
		ur.setPrimaryEmail(userdtl.getPrimaryEmail());
		ur.setState(userdtl.getState());
		em.persist(ur);

		UserLogin ul = new UserLogin();
		ul.setUr(ur);
		ul.setUserPassword(userdtl.getPassword());
		ul.setUserRole("User");
		em.persist(ul);

		LoanTransaction lt = new LoanTransaction();
		lt.setUr(ur);
		lt.setLoanAmount(userdtl.getLoanAmt());
		lt.setTenure(userdtl.getLoanTenure());
		lt.setAppStatus("Ackn");
		LoanType l = em.find(LoanType.class, userdtl.getLoanTypeId());

		System.out.println(l);
		lt.setLoanType(l);

		lt.setUr(ur);

		em.persist(lt);
		return lt.getLoanTransactionId();
	}

	@Override
	public int validate(UserDetails userDtls) {
		int message = 1;

		Query query = em.createQuery("SELECT a.primaryEmail," + " b.userPassword "
				+ " FROM UserRegistration a , UserLogin b\r\n"
				+ " WHERE a.userResId = b.ur");
		List<Object[]> userDetsList = (List<Object[]>)query.getResultList();
		
		for(int i=0; i<userDetsList.size(); i++) {
			if(userDetsList.get(i)[0].equals(userDtls.getPrimaryEmail()) && 
					userDetsList.get(i)[1].equals(userDtls.getPassword())) {
				message =0;
			}
		}
		
		return message;
	}

}
