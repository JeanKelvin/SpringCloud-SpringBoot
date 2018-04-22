package com.coderef.delivery.auth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //Torna nossa aplicação visível ao Eureka Server com base nas configurações que definimos no application.yml
@SpringBootApplication
public class DeliveryAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryAuthServerApplication.class, args);
	}
}
