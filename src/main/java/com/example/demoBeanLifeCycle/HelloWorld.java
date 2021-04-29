package com.example.demoBeanLifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class HelloWorld {

    @PostConstruct
    @Bean
    public void init() throws Exception {
        System.out.println("Bean HelloWorld has been instantiated and " +
                "I'm the init() method");
    }

    @PreDestroy
    @Bean
    public void destroy() throws Exception {
        System.out.println("Container has been closed and " +
                "I'm the destoy method");
    }
}
