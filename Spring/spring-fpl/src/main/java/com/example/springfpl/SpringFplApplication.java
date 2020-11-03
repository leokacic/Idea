package com.example.springfpl;

import com.example.springfpl.repositories.FplRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@ComponentScan({"com.example.springfpl"})
@EntityScan
@EnableJpaRepositories
public class SpringFplApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringFplApplication.class, args);
	}

}
