package br.com.cardoso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoSpringConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringConfigServerApplication.class, args);
	}

}
