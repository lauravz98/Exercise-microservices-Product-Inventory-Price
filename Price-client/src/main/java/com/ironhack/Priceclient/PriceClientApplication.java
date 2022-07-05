package com.ironhack.Priceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PriceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceClientApplication.class, args);
	}

}
