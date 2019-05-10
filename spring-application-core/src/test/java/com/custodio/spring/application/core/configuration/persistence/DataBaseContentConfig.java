package com.custodio.spring.application.core.configuration.persistence;

import com.custodio.spring.application.core.configuration.util.Parameters;
import com.custodio.spring.application.core.service.AirportService;
import com.custodio.spring.application.core.service.CountryService;
import com.custodio.spring.application.core.service.RunwayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

/**
 * Class that implements the life cicle hook {@link ContextRefreshedEvent} to populate the in-memory database with contents from CSV files.
 *
 * @author wcustodio.
 */
@Component
public class DataBaseContentConfig implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private Parameters parameters;

    @Autowired
    private AirportService airportService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private RunwayService runwayService;

    @Override
    public void onApplicationEvent(final ContextRefreshedEvent contextRefreshedEvent) {
        try {
            // Initialize the table COUNTRY with the content from the CSV file.
            countryService.initializeTableContentFromCsvFile(new File(this.getClass().getResource(parameters.getCsvCountryPath()).getPath()));

            // Initialize the table AIRPORT with the content from the CSV file.
            airportService.initializeTableContentFromCsvFile(new File(this.getClass().getResource(parameters.getCsvAirportPath()).getPath()));

            // Initialize the table RUNWAY with the content from the CSV file.
            runwayService.initializeTableContentFromCsvFile(new File(this.getClass().getResource(parameters.getCsvRunwayPath()).getPath()));
        } catch (final IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
