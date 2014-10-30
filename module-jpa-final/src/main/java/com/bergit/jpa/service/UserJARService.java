package com.bergit.jpa.service;

import java.util.List;

import com.bergit.jpa.model.User;


public interface UserJARService {
	 public User getUserDetails(String userId);  
	 public String saveUserDetails(User user);  
	 public List<User> getListUserDetails();
}
