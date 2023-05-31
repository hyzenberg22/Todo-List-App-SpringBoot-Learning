package com.in28minutes.springboot.Myfirstapplication.login;

import org.springframework.stereotype.Service;

//authentication services hard-coded
@Service
public class AuthenticationService {
	public boolean authenticate(String userName, String password) {
		boolean isValidUsername = userName.equalsIgnoreCase("test");
		boolean isValidpassword = password.equalsIgnoreCase("test");

		return isValidpassword && isValidUsername;
	}
}
