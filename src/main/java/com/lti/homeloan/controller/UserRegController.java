package com.lti.homeloan.controller;

import java.io.Console;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.homeloan.bean.UserDetails;
import com.lti.homeloan.bean.UserRegistration;
import com.lti.homeloan.dao.UserRegDaoImpl;
import com.lti.homeloan.service.UserRegServiceImpl;
@CrossOrigin("*")
@RestController
@RequestMapping("/userregistration")
public class UserRegController {
	
	@Autowired
	private UserRegServiceImpl userService;
	
	@PostMapping("/addUser")
	public int addUser(@RequestBody UserDetails userDts) {
		
		System.out.println("UserRegistration"+userDts);
		
		return userService.registerUser(userDts);	
	}
	
	@PostMapping("/validate")
	public int validate(@RequestBody UserDetails userDts) {
		
		System.out.println("UserRegistration"+userDts);
		
		return userService.validate(userDts);	
	}

	
}
