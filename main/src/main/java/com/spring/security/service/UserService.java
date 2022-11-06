package com.spring.security.service;

import com.spring.security.entity.UserDtls;

public interface UserService {
	public UserDtls createUser(UserDtls user);
	public boolean checkEmail(String email);
}
