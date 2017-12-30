package com.hsj.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsj.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/hello")
	public String hello() {
		
		userService.getUser();

		return "hello";
	}

}
