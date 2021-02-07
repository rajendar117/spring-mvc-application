package com.kmc.dao;

import com.kmc.model.Login;
import com.kmc.model.User;

public interface UserDao {
	
	int register(User user);

	User validateUser(Login login);
}
