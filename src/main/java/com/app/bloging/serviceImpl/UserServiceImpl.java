package com.app.bloging.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.bloging.dao.CustomHttpResponse;
import com.app.bloging.dao.IUserDao;
import com.app.bloging.model.UserRegistration;
import com.app.bloging.service.IUserService;
import com.google.gson.Gson;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao useDao;

	@Override
	public Object createUser(UserRegistration user) {
		UserRegistration userRegister = new UserRegistration();
		CustomHttpResponse customHttpResponse = new CustomHttpResponse();
		userRegister.setFirstName(user.getFirstName());
		userRegister.setLastName(user.getLastName());
		userRegister.setEmail(user.getEmail());
		userRegister.setPassword(user.getPassword());
		userRegister.setPhoneNumber(user.getPhoneNumber());
		userRegister.setUserName(user.getUserName());
		if(this.useDao.save(userRegister) != null) {
			customHttpResponse.setMessage("user created successfully");
	        customHttpResponse.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<Object>(new Gson().toJson(customHttpResponse), 
                    HttpStatus.OK);
		}
		return null;
	}

	@Override
	public  Object validateUserByNameAndPassword(String userName, String password) {
		UserRegistration user = this.useDao.findByuserNameAndPassword(userName,password);
		CustomHttpResponse customHttpResponse = new CustomHttpResponse();
		if(user ==null) {
			customHttpResponse.setMessage("invalid credentials");
	        customHttpResponse.setStatus(HttpStatus.UNAUTHORIZED.value());
		} else {
			customHttpResponse.setMessage("success");
	        customHttpResponse.setStatus(HttpStatus.OK.value());
		}

        return new ResponseEntity<Object>(new Gson().toJson(customHttpResponse), 
                                          HttpStatus.OK);
	}
}
