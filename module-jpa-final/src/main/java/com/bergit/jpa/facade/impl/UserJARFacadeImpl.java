package com.bergit.jpa.facade.impl;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bergit.jpa.facade.UserJARFacade;
import com.bergit.jpa.model.User;
import com.bergit.jpa.service.UserJARService;

@Service
public class UserJARFacadeImpl  implements UserJARFacade{

	@Autowired
	UserJARService userJARService;
	
	@Override
	public User getUserDetail(String userID) {
		// TODO Auto-generated method stub
		return userJARService.getUserDetails(userID);
	}

	@Override
	public JRDataSource getListUserDetails() {

		List<User> items = new ArrayList<User>();
		items = userJARService.getListUserDetails();
		JRDataSource response = new JRBeanCollectionDataSource(items);	

		return response;
	}

}
