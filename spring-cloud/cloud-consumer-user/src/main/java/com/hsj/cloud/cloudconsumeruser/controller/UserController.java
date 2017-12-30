package com.hsj.cloud.cloudconsumeruser.controller;

import com.hsj.cloud.cloudconsumeruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/user/{id}")
  public User findById(@PathVariable Long id) {
    User findOne = restTemplate.getForObject("http://localhost:8000/"+id,User.class);
    return findOne;
  }
}
