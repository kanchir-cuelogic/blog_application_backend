package com.app.bloging.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bloging.dao.IUserDao;
import com.app.bloging.model.UserRegistration;
import com.app.bloging.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao useDao;

	@Override
	public UserRegistration createUser(UserRegistration user) {
		UserRegistration userRegister = new UserRegistration();
		userRegister.setFirstName(user.getFirstName());
		userRegister.setLastName(user.getLastName());
		userRegister.setEmail(user.getEmail());
		userRegister.setPassword(user.getPassword());
		userRegister.setPhoneNumber(user.getPhoneNumber());
		userRegister.setUserName(user.getUserName());
		return this.useDao.save(userRegister);
	}

	@Override
	public ResponseBody  validateUserByNameAndPassword(String userName, String password) {
		UserRegistration user = this.useDao.findByuserNameAndPassword(userName,password);
		if(user ==null) {
			return {message: "invalid credential"};
		} else {
			return {message:"success"};
		}
	}
}
