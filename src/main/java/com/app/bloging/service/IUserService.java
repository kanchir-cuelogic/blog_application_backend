package com.app.bloging.service;

import com.app.bloging.model.UserRegistration;

public interface IUserService {
	
	public UserRegistration createUser(UserRegistration user);

	public String validateUserByNameAndPassword(String userName, String password);

}
