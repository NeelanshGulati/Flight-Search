package com.nagarro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.dao.LoginDAO;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDAO loginDAO;

	public boolean checkLogin(String username, String password) {
		return loginDAO.checkLogin(username, password);
	}

}
