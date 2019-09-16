package com.foo.webflux;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableReactiveMongoRepositories(basePackages = "com.foo.webflux.repository")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
