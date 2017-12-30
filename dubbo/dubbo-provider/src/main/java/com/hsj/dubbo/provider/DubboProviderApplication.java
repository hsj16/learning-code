package com.hsj.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = { "classpath:dubbo/dubbo-*.xml" })
@ComponentScan("com")
public class DubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
	}
}
