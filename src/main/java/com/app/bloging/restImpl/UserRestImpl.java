package com.app.bloging.restImpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.app.bloging.model.UserRegistration;
import com.app.bloging.rest.IUserRest;
import com.app.bloging.service.IUserService;

@RestController
public class UserRestImpl implements IUserRest{
	
	@Autowired
	private IUserService userService;
	
	@Override
	public String createUser(UserRegistration user) {
		UserRegistration createUser = this.userService.createUser(user);
		return "User create Successfully";
	}

	@Override
	public String validateUserByNameAndPassword(String userName, String Password) {
		return this.userService.validateUserByNameAndPassword(userName,Password);
	}

}
