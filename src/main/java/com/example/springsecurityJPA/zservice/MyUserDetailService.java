package com.example.springsecurityJPA.zservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service

public class MyUserDetailService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("My User Name is :"+username);
		Optional<User> user =userRepo.findByUserName(username);
		System.out.println("User from DB"+user);
		user.orElseThrow(()->new UsernameNotFoundException("User with Name not found"+username));
		return  user.map(MyUserDetails::new).get();
	}

}