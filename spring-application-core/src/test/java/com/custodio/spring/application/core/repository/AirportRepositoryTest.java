package com.custodio.spring.application.core.repository;

import com.custodio.spring.application.core.entity.Airport;
import com.custodio.spring.application.core.configuration.root.BaseTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Class responsible for executing unit tests for {@link AirportRepository}.
 *
 * @author wcustodio.
 */
@Transactional
public class AirportRepositoryTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    private static final int EXPECTED_AIRPORTS = 46505;

    @Autowired
    private AirportRepository airportRepository;

    /**
     * Test the search for all registered airports in database.
     */
    @Test
    public void findAll() {
        final List<Airport> entities = airportRepository.findAll();
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_AIRPORTS, entities.size());
        for (final Airport entity : entities) {
            Assert.assertNotNull(entity.getId());
        }
    }
}
