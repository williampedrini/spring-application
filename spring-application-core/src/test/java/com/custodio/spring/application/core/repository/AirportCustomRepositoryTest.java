package com.custodio.spring.application.core.repository;

import com.custodio.spring.application.core.entity.Airport;
import com.custodio.spring.application.core.configuration.root.BaseTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Class responsible for executing unit tests for {@link AirportCustomRepository}.
 *
 * @author wcustodio.
 */
@Transactional
public class AirportCustomRepositoryTest extends BaseTestRunner {

    /**
     * Constants used as parameters by the unit tests.
     */
    private static final String US_COUNTRY_CODE = "US";
    private static final String US_COUNTRY_NAME = "United St";

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_AIRPORTS = 46505;
    private static final int EXPECTED_AIRPORTS_BY_US = 21501;
    private static final int EXPECTED_AIRPORTS_BY_US_WITHOUT_COUNTRY_CODE = 21507;

    @Autowired
    private AirportCustomRepository airportRepository;

    /**
     * Search for all the airports associated to a country without full name and a code.
     */
    @Test
    public void findAllByCountryNameAndCountryCodeWithoutCountryFullName() {
        final List<Airport> entities = airportRepository.findAllByCountryNameAndCountryCode(US_COUNTRY_NAME, US_COUNTRY_CODE);
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS_BY_US, entities.size());
        for (final Airport entity : entities) {
            Assert.assertNotNull(entity.getId());
        }
    }

    /**
     * Search for all the airports associated to a country with name as 'null' and with a code.
     */
    @Test
    public void findAllByCountryNameAndCountryCodeWithoutCountryName() {
        final List<Airport> entities = airportRepository.findAllByCountryNameAndCountryCode(null,US_COUNTRY_CODE);
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS_BY_US, entities.size());
        for (final Airport entity : entities) {
            Assert.assertNotNull(entity.getId());
        }
    }

    /**
     * Search for all the airports associated to a country with empty name and with a code.
     */
    @Test
    public void findAllByCountryNameAndCountryCodeWithEmptyCountryName() {
        final List<Airport> entities = airportRepository.findAllByCountryNameAndCountryCode("",US_COUNTRY_CODE);
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS_BY_US, entities.size());
        for (final Airport entity : entities) {
            Assert.assertNotNull(entity.getId());
        }
    }

    /**
     * Search for all the airports associated to a country with name and a code as 'null'.
     */
    @Test
    public void findAllByCountryNameAndCountryCodeWithoutCountryCode() {
        final List<Airport> entities = airportRepository.findAllByCountryNameAndCountryCode(US_COUNTRY_NAME,null);
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS_BY_US_WITHOUT_COUNTRY_CODE, entities.size());
        for (final Airport entity : entities) {
            Assert.assertNotNull(entity.getId());
        }
    }

    /**
     * Search for all the airports associated to a country with name and an empty code.
     */
    @Test
    public void findAllByCountryNameAndCountryCodeWithEmptyCountryCode() {
        final List<Airport> entities = airportRepository.findAllByCountryNameAndCountryCode(US_COUNTRY_NAME,"");
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS_BY_US_WITHOUT_COUNTRY_CODE, entities.size());
        for (final Airport entity : entities) {
            Assert.assertNotNull(entity.getId());
        }
    }

    /**
     * Search for all the airports associated to a country with empty name and an empty code.
     */
    @Test
    public void findAllByCountryNameAndCountryCodeWithEmptyParameters() {
        final List<Airport> entities = airportRepository.findAllByCountryNameAndCountryCode("","");
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS, entities.size());
        for (final Airport entity : entities) {
            Assert.assertNotNull(entity.getId());
        }
    }

    /**
     * Search for all the airports associated to a country with name as 'null' and a code as 'null'.
     */
    @Test
    public void findAllByCountryNameAndCountryCodeWithoutParameters() {
        final List<Airport> entities = airportRepository.findAllByCountryNameAndCountryCode(null,null);
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS, entities.size());
        for (final Airport entity : entities) {
            Assert.assertNotNull(entity.getId());
        }
    }
}