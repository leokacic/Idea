package com.example.configlocalcodelabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigLocalCodelabsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigLocalCodelabsApplication.class, args);
	}

}
