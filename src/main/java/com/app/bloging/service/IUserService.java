package com.app.bloging.service;

import com.app.bloging.model.UserRegistration;

public interface IUserService {
	
	public Object createUser(UserRegistration user);

	public Object validateUserByNameAndPassword(String userName, String password);

}
