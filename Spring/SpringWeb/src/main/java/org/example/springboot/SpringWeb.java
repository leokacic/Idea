package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class SpringWeb
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = SpringApplication.run(SpringWeb.class,args);

    }
}
