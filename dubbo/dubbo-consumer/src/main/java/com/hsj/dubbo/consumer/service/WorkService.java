package com.hsj.dubbo.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsj.dubbo.api.model.User;
import com.hsj.dubbo.api.service.UserService;

@Service
public class WorkService {
	@Autowired
	private UserService userService;
	
	public void printUser() {
		User user = userService.getUser("1");
		
		System.out.println(user.getName());
	}

}
