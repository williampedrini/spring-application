package com.custodio.spring.application.core.configuration.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Class responsible for mapping all the properties from the properties file 'config/config.properties'.
 *
 * @author wcustodio.
 */
@Configuration
@PropertySource("classpath:config/config.properties")
public class Parameters {

    @Value("${csv.airport.path}")
    private String csvAirportPath;

    @Value("${csv.country.path}")
    private String csvCountryPath;

    @Value("${csv.runway.path}")
    private String csvRunwayPath;

    public String getCsvAirportPath() {
        return csvAirportPath;
    }

    public String getCsvCountryPath() {
        return csvCountryPath;
    }

    public String getCsvRunwayPath() {
        return csvRunwayPath;
    }
}
