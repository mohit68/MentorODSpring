package com.iiht.caseStudy4paymentDtls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.iiht")
public class CaseStudy4PaymentDtlsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaseStudy4PaymentDtlsApplication.class, args);
	}

}
