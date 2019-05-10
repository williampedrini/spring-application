package com.custodio.spring.application.core.repository;

import com.custodio.spring.application.core.configuration.root.BaseTestRunner;
import com.custodio.spring.application.core.entity.Country;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Class responsible for executing unit tests for {@link CountryRepository}.
 *
 * @author wcustodio.
 */
@Transactional
public class CountryRepositoryTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_COUNTRIES = 247;
    private static final int EXPECTED_AIRPORTS_BY_PM_COUNTRY = 2;

    /**
     * Constants used as parameters by the unit tests.
     */
    private static final Long PM_COUNTRY_ID = 302750L;

    @Autowired
    private CountryRepository countryRepository;

    /**
     * Search for a certain country by its id.
     */
    @Test
    public void findById() {
        final Country entity = countryRepository.findOne(PM_COUNTRY_ID);
        Assert.assertNotNull(entity);
        Assert.assertEquals(PM_COUNTRY_ID, entity.getId());
        Assert.assertEquals(EXPECTED_AIRPORTS_BY_PM_COUNTRY, entity.getAirports().size());
    }

    /**
     * Test the search for all registered countries in database.
     */
    @Test
    public void findAll() {
        final List<Country> entities = countryRepository.findAll();
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_COUNTRIES, entities.size());
        for (final Country entity : entities) {
            Assert.assertNotNull(entity.getId());
        }
    }
}