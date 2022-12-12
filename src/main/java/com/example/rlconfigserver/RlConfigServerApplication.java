package com.example.rlconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RlConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RlConfigServerApplication.class, args);
	}

}
