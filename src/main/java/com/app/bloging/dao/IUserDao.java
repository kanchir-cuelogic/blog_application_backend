package com.app.bloging.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bloging.model.UserRegistration;

@Repository
public interface IUserDao extends JpaRepository<UserRegistration, Long>{

	public UserRegistration findByuserNameAndPassword(String userName, String password); 
	//String find (String userName, String password);
	

}
