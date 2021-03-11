package com.happyprogrammimg.deparment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeparmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeparmentApplication.class, args);
	}

}
