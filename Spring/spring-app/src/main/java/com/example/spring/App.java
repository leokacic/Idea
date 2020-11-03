package com.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Car obj = (Car) context.getBean("car");
//        Vehicle obj2 = (Vehicle) context.getBean("bike");
        obj.drive();
//        obj2.drive();

        Tire t = (Tire) context.getBean("tire");
        System.out.println(t);
    }
}
