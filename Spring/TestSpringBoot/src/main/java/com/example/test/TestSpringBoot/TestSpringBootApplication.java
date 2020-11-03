package com.example.test.TestSpringBoot;

import com.example.test.TestSpringBoot.controler.HomeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.sound.midi.ShortMessage;

@SpringBootApplication
@ComponentScan
public class TestSpringBootApplication {


	public static void main(String[] args) {


		SpringApplication.run(TestSpringBootApplication.class, args);

	}

}
