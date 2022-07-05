package com.ironhack.Inventoryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InventoryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryClientApplication.class, args);
	}

}
