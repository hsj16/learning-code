package com.hsj.dubbo.provider.service;

import org.springframework.stereotype.Service;

import com.hsj.dubbo.api.model.User;
import com.hsj.dubbo.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User getUser(String id) {
		User user = new User();
		user.setId(id);
		user.setName("haha");
		return user;
	}

}
