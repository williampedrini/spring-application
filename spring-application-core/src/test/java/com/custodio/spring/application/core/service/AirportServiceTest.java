package com.custodio.spring.application.core.service;


import com.custodio.spring.application.core.bean.AirportBean;
import com.custodio.spring.application.core.configuration.root.BaseTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Service responsible for executing procedures related to an airport.
 *
 * @author wcustodio.
 */
public class AirportServiceTest extends BaseTestRunner {

    /**
     * Constants used as parameters by the unit tests.
     */
    private static final Long OC_AIRPORT_REF = 27183L;
    private static final String US_COUNTRY_CODE = "US";
    private static final String US_COUNTRY_NAME = "United St";

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_AIRPORTS_BY_US_COUNTRY = 21501;
    private static final int EXPECTED_AIRPORTS_WITHOUT_PARAMETERS = 46505;
    private static final int EXPECTED_RUNWAYS_BY_OS_AIRPORT = 2;
    private static final int EXPECTED_AIRPORTS_BY_US_COUNTRY_WITHOUT_COUNTRY_CODE = 21507;

    @Autowired
    private AirportService airportService;

    @Test
    public void findById() {
        final AirportBean bean = airportService.findById(OC_AIRPORT_REF);
        Assert.assertNotNull(bean);
        Assert.assertEquals(OC_AIRPORT_REF, bean.getId());
        Assert.assertEquals(EXPECTED_RUNWAYS_BY_OS_AIRPORT, bean.getRunways().size());
    }

    /**
     * Search for all the airports associated to a country without full name and a code.
     */
    @Test
    public void findAllByCountryNameAndCountryCodeWithoutCountryFullName() {
        final List<AirportBean> beans = airportService.findAllByCountryNameAndCountryCode(US_COUNTRY_NAME, US_COUNTRY_CODE);
        Assert.assertNotNull(beans);
        Assert.assertFalse(beans.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS_BY_US_COUNTRY, beans.size());
    }

    /**
     * Search for all the airports associated to a country with name as 'null' and with a code.
     */
    @Test
    public void findAllByCountryNameAndCountryCodeWithoutCountryName() {
        final List<AirportBean> beans = airportService.findAllByCountryNameAndCountryCode(null,US_COUNTRY_CODE);
        Assert.assertNotNull(beans);
        Assert.assertFalse(beans.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS_BY_US_COUNTRY, beans.size());
    }

    /**
     * Search for all the airports associated to a country with empty name and with a code.
     */
    @Test
    public void findAllByCountryNameAndCountryCodeWithEmptyCountryName() {
        final List<AirportBean> beans = airportService.findAllByCountryNameAndCountryCode("",US_COUNTRY_CODE);
        Assert.assertNotNull(beans);
        Assert.assertFalse(beans.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS_BY_US_COUNTRY, beans.size());
    }

    /**
     * Search for all the airports associated to a country with name and a code as 'null'.
     */
    @Test
    public void findAllByCountryNameAndCountryCodeWithoutCountryCode() {
        final List<AirportBean> beans = airportService.findAllByCountryNameAndCountryCode(US_COUNTRY_NAME,null);
        Assert.assertNotNull(beans);
        Assert.assertFalse(beans.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS_BY_US_COUNTRY_WITHOUT_COUNTRY_CODE, beans.size());
    }

    /**
     * Search for all the airports associated to a country with name and an empty code.
     */
    @Test
    public void findAllByCountryNameAndCountryCodeWithEmptyCountryCode() {
        final List<AirportBean> beans = airportService.findAllByCountryNameAndCountryCode(US_COUNTRY_NAME,"");
        Assert.assertNotNull(beans);
        Assert.assertFalse(beans.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS_BY_US_COUNTRY_WITHOUT_COUNTRY_CODE, beans.size());
    }

    /**
     * Search for all the airports associated to a country with empty name and an empty code.
     */
    @Test
    public void findAllByCountryNameAndCountryCodeWithEmptyParameters() {
        final List<AirportBean> beans = airportService.findAllByCountryNameAndCountryCode("","");
        Assert.assertNotNull(beans);
        Assert.assertFalse(beans.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS_WITHOUT_PARAMETERS, beans.size());
    }

    /**
     * Search for all the airports associated to a country with name as 'null' and a code as 'null'.
     */
    @Test
    public void findAllByCountryNameAndCountryCodeWithoutParameters() {
        final List<AirportBean> beans = airportService.findAllByCountryNameAndCountryCode(null,null);
        Assert.assertNotNull(beans);
        Assert.assertFalse(beans.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS_WITHOUT_PARAMETERS, beans.size());
    }
}
