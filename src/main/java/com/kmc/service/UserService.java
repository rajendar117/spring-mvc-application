package com.kmc.service;

import com.kmc.model.Login;
import com.kmc.model.User;

public interface UserService {
	int register(User user);

	User validateUser(Login login);
}
