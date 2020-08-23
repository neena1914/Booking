package com.infy.management.InfyBooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class InfyBookingApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(InfyBookingApplication.class, args);
		
	}

}
