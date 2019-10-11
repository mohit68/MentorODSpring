 package com.iiht.caseStudy4gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.EurekaClient;

@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan({"com.iiht"})
public class CaseStudy4GatewayApplication {

	@Autowired
	@Lazy
	private EurekaClient eurekaClient;

	public static void main(String[] args) {
		SpringApplication.run(CaseStudy4GatewayApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	   // Do any additional configuration here
	   return builder.build();
	}
	
	
}
