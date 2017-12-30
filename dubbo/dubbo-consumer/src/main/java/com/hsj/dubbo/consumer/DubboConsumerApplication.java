package com.hsj.dubbo.consumer;

import com.github.jessyZu.dz.TraceDubboAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = { "classpath:dubbo/dubbo-*.xml" })
@ComponentScan("com")
@Import(TraceDubboAutoConfiguration.class)
public class DubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerApplication.class, args);
	}
}
