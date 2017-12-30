package com.hsj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@SpringBootApplication
public class DemoApplication {

	ExecutorService executor = Executors.newFixedThreadPool(10);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
