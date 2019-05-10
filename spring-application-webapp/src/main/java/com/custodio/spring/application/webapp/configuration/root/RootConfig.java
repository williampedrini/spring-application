package com.custodio.spring.application.webapp.configuration.root;

import com.custodio.spring.application.webapp.configuration.persistence.DataBaseConfig;
import com.custodio.spring.application.webapp.configuration.util.Parameters;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Class responsible for setting up the application context.
 *
 * @author wcustodio.
 */
@Configuration
@Import({Parameters.class, DataBaseConfig.class})
public class RootConfig {
}