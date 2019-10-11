package com.iiht.micro.microService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class MicroServer2AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServer2AppApplication.class, args);
	}

	
}