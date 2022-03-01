package com.lti.homeloan.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.homeloan.bean.UserRegistration;

public interface UserRegDaoJPARepository extends JpaRepository<UserRegistration, Integer> {

}
