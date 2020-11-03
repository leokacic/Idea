package com.example.springkvi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringKviApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKviApplication.class, args);
	}

}
