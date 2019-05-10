package com.custodio.spring.application.core.configuration.root;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Class responsible for setting up the unit tests context.
 *
 * @author wcustodio.
 */
@Configuration
@SpringBootApplication
@ComponentScan(basePackages = {"com.custodio.spring.application.core"})
@EnableJpaRepositories("com.custodio.spring.application.core.repository")
@EntityScan(basePackages = {"com.custodio.spring.application.core.entity"}, basePackageClasses = {Jsr310JpaConverters.class})
public class TestRootConfig {
}
