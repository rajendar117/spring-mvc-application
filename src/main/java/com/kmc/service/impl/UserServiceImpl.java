package com.kmc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.kmc.dao.UserDao;
import com.kmc.model.Login;
import com.kmc.model.User;
import com.kmc.service.UserService;
public class UserServiceImpl implements UserService{

	@Autowired
	public UserDao userDao;

	public int register(User user) {
		return userDao.register(user);
	}

	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}
}
