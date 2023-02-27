package com.service;

import com.model.User;

public class LoginService {

	public String validateUser(User user) {
		String temp="";
		if((user.getUserId()==12)&&(user.getPassword().equals("secret"))) {
			temp="hari can login";
		}
		if((user.getUserId()==13)&&(user.getPassword().equals("nencheppa"))) {
			temp="venky can login";
		}
		return temp;
	}
}
