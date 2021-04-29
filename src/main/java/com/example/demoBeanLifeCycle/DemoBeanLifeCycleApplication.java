package com.example.demoBeanLifeCycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoBeanLifeCycleApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoBeanLifeCycleApplication.class, args);
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(HelloWorld.class);
		context.register(HelloWorld.class);
	}

}
