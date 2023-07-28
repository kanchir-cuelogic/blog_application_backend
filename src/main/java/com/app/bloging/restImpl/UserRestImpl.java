package com.app.bloging.restImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.app.bloging.dao.CustomHttpResponse;
import com.app.bloging.model.UserRegistration;
import com.app.bloging.rest.IUserRest;
import com.app.bloging.service.IUserService;
import com.google.gson.Gson;

@RestController
public class UserRestImpl implements IUserRest{
	
	@Autowired
	private IUserService userService;
	
	@Override
	public ResponseEntity<Object> createUser(UserRegistration user) {
		CustomHttpResponse customHttpResponse = new CustomHttpResponse();
		Object createUser = this.userService.createUser(user);
		 if(createUser != null) {
		    	customHttpResponse.setMessage("User create Successfully");
		    	customHttpResponse.setStatus(HttpStatus.OK.value());
		 }
		 else {
			customHttpResponse.setMessage("User not created");
		    customHttpResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		 }
		 return new ResponseEntity<Object>(new Gson().toJson(customHttpResponse), 
		            HttpStatus.OK);
	}

	@Override
	public Object validateUserByNameAndPassword(String userName, String Password) {
		return this.userService.validateUserByNameAndPassword(userName,Password);
	}

}
