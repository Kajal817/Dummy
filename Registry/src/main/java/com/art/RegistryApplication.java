package com.art;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryApplication.class, args);
		System.out.println("Hello to Github added in Node branch");
		System.out.println("Hello to Github added in Node branch");
		System.out.println("Pushing to node branch ");
	}

}
