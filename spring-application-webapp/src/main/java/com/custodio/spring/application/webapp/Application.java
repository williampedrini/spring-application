package com.custodio.spring.application.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Class responsible for setting up the application.
 *
 * @author wcustodio
 */
@ComponentScan("com.custodio.spring.application")
@Configuration
@EnableJpaRepositories(basePackages = {"com.custodio.spring.application.core.repository"})
@EnableAutoConfiguration
@EnableTransactionManagement
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
