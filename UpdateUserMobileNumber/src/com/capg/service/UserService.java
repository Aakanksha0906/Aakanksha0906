package com.capg.service;

import com.capg.bean.User;

public interface UserService {
	
	public Integer addUser(User user) ;
	public User displayUser(int userid);
	public String update(int userid, String mobilenumber); 
	}


