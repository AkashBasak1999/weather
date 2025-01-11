package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;

//it loads the user to the spring security and then the user service will be able to use this 
public class userDetailServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepo.getUserByUserName(username);
		if(user==null) {
			throw new UsernameNotFoundException("Could Not Found|||");
		}
		customUserDetails custom=new customUserDetails(user);
		return custom;
	}
}
