package com.coderef.deliveryconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer //Para que essa aplicação seja um Servidor de Configuração
@SpringBootApplication
public class DeliveryConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(
				DeliveryConfigServerApplication.class,
				args);
	}
}
