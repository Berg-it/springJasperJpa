package com.bergit.jpa.repository;

import com.bergit.jpa.model.User;
import java.util.List;

public interface UserDaoJAR {

	 public User getUserDetails(String userId);  
	 public String saveUserDetails(User user); 
	 public List<User> getListUserDetails();
}
