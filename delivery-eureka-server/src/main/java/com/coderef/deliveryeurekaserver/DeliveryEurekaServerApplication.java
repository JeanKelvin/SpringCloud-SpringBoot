package com.coderef.deliveryeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //Para que seja iniciado um Servidor do Eureka.
@SpringBootApplication
public class DeliveryEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryEurekaServerApplication.class, args);
	}
}
