package com.hsj.cloud.cloudconsumeruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudProviderUserApplication.class, args);
	}
}
