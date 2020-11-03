package org.example.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@ComponentScan
public class CourseApiApp {

    public static void main(String[] args) {
        SpringApplication.run(CourseApiApp.class,args);
    }
}
