package com.hsj.dubbo.consumer.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsj.dubbo.consumer.service.WorkService;

@RestController
public class WorkController {
	@Autowired
	private WorkService workService;
	
	@GetMapping("/test")
	public String getUser() {
		workService.printUser();
		
		return "OK";
	}

}
