package com.hsj.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsj.demo.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public void getUser() {
		userDao.getUser();
	}

}
