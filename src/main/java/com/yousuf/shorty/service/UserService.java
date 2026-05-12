package com.yousuf.shorty.service;
import com.yousuf.shorty.model.User;
public interface UserService {
 public String addUser(User u);
 public User checkUserlogin(String email, String pwd); 
}
