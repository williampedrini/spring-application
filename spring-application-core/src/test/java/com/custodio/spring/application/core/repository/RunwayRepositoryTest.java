package com.custodio.spring.application.core.repository;

import com.custodio.spring.application.core.configuration.root.BaseTestRunner;
import com.custodio.spring.application.core.entity.Runway;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Class responsible for executing unit tests for {@link RunwayRepository}.
 *
 * @author wcustodio.
 */
@Transactional
public class RunwayRepositoryTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    public static final long OC_AIRPORT_REF = 27183L;
    private static final int EXPECTED_RUNWAYS = 39536;
    private static final int EXPECTED_RUNWAYS_BY_OS_AIRPORT = 2;

    @Autowired
    private RunwayRepository runwayRepository;

    /**
     * Test the search for all registered runways in database.
     */
    @Test
    public void findAll() {
        final List<Runway> entities = runwayRepository.findAll();
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_RUNWAYS, entities.size());
        for (final Runway entity : entities) {
            Assert.assertNotNull(entity.getId());
        }
    }

    /**
     * Search for all airports associated to a certain airport.
     */
    @Test
    public void findAllByAirportRefWithValidAirportRef() {
        final List<Runway> entities = runwayRepository.findAllByAirportRef(OC_AIRPORT_REF);
        Assert.assertNotNull(entities);
        Assert.assertFalse(entities.isEmpty());
        Assert.assertEquals(EXPECTED_RUNWAYS_BY_OS_AIRPORT, entities.size());
        for (final Runway entity : entities) {
            Assert.assertNotNull(entity.getId());
        }
    }

    /**
     * Search for all airports associated to a certain airport with the airport reference code as 'null'.
     */
    @Test
    public void findAllByAirportRefWithNullAirportRef() {
        final List<Runway> entities = runwayRepository.findAllByAirportRef(null);
        Assert.assertNotNull(entities);
        Assert.assertTrue(entities.isEmpty());
    }
}
