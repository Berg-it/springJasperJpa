package com.bergit.jpa.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bergit.jpa.model.User;
import com.bergit.jpa.repository.impl.UserDaoJARImpl;
import com.bergit.jpa.service.UserJARService;


@Service("userJARService")
public class UserJARServiceImpl implements UserJARService {
	
	private static final Logger logger = Logger.getLogger(UserJARServiceImpl.class);
	
	 @Autowired  
	 UserDaoJARImpl userDaoJAR;

	public User getUserDetails(String userId) {
		return userDaoJAR.getUserDetails(userId);
	}

	public String saveUserDetails(User user) {
		return null;
	}

	@Override
	public List<User> getListUserDetails() {

		return userDaoJAR.getListUserDetails();
	}
	

}
