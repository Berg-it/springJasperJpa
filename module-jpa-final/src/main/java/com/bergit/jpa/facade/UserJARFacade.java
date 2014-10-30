package com.bergit.jpa.facade;

import net.sf.jasperreports.engine.JRDataSource;

import com.bergit.jpa.model.User;

public interface UserJARFacade {
	
	public User getUserDetail(String userID);
	public JRDataSource getListUserDetails();

}
