package com.example.springhibernatetelusko;

import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringHibernateTeluskoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateTeluskoApplication.class, args);
		Laptop laptop = new Laptop();
		laptop.setlId(101);
		laptop.setlName("Dell");

		Student s = new Student();
		s.setName("Navin");
		s.setRollNo(1);
		s.setMarks(50);


		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry registry = new StandardServiceRegistry() {
			@Override
			public ServiceRegistry getParentServiceRegistry() {

				return null;
			}

			@Override
			public <R extends Service> R getService(Class<R> aClass) {
				return null;
			}

			@Override
			public void close() {

			}
		};


	}

}

