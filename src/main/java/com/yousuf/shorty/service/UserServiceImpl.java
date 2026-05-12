package com.yousuf.shorty.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yousuf.shorty.model.User;
import com.yousuf.shorty.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public String addUser(User u) {
		userRepo.save(u);
		return "Registered Successfully";
	}
	
	@Override
	public User checkUserlogin(String email, String pwd) {
		
		
		return userRepo.checkLogin(email, pwd);
	}
}
