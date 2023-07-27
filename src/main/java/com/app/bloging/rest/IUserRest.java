package com.app.bloging.rest;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.bloging.model.UserRegistration;


/**
 * The Interface IBlogRest.
 */

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/User")
@Validated
public interface IUserRest {

	@PostMapping("/createUser")
	public Object createUser(@RequestBody UserRegistration user);
	
	 @GetMapping("/validateUserByNameAndPassword")
	 public Object validateUserByNameAndPassword(@RequestParam("userName") String userName, @RequestParam("Password") String Password);
}
