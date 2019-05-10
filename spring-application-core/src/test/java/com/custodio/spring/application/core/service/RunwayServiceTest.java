package com.custodio.spring.application.core.service;


import com.custodio.spring.application.core.bean.RunwayBean;
import com.custodio.spring.application.core.configuration.root.BaseTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RunwayServiceTest extends BaseTestRunner {

    /**
     * Expected results used by the unit tests.
     */
    private static final long OC_AIRPORT_REF = 27183L;
    private static final int EXPECTED_RUNWAYS_BY_OS_AIRPORT = 2;

    @Autowired
    private RunwayService runwayService;

    @Test
    public void findAllByAirportRefWithValidAirportRef() {
        final List<RunwayBean> beans = runwayService.findAllByAirportRef(OC_AIRPORT_REF);
        Assert.assertNotNull(beans);
        Assert.assertFalse(beans.isEmpty());
        Assert.assertEquals(EXPECTED_RUNWAYS_BY_OS_AIRPORT, beans.size());
        for (final RunwayBean bean : beans) {
            Assert.assertNotNull(bean.getId());
        }
    }

    @Test
    public void findAllByAirportRefWithNullAirportRef() {
        final List<RunwayBean> beans = runwayService.findAllByAirportRef(null);
        Assert.assertNotNull(beans);
        Assert.assertTrue(beans.isEmpty());
    }
}
