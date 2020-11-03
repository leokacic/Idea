package com.example.springboot.teluskoSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.lang.module.Configuration;

@SpringBootApplication
@ComponentScan
public class TeluskoSpringBootApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TeluskoSpringBootApplication.class, args);

		Alien a = context.getBean(Alien.class);
		System.out.println("Hello");
		a.toString();
	}
}
