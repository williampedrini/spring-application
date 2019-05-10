package com.custodio.spring.application.core.service;


import com.custodio.spring.application.core.bean.RunwayBean;
import com.custodio.spring.application.core.bean.RunwayCsvBean;
import com.custodio.spring.application.core.entity.Runway;
import com.custodio.spring.application.core.mapper.RunwayMapper;
import com.custodio.spring.application.core.repository.RunwayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Service responsible for executing procedures related to a runway.
 *
 * @author wcustodio.
 */
@Service
@Transactional
public class RunwayService {

    @Autowired
    private CsvFileService csvFileService;

    @Autowired
    private RunwayMapper runwayMapper;

    @Autowired
    private RunwayRepository runwayRepository;

    /**
     * Read all content from a specific csv file which contains information about runways.
     * @param csv File to be read.
     * @return List of {@link RunwayCsvBean} with all runways from the csv file persisted into database.
     * @throws IOException Error while trying to read the csv.
     */
    public List<RunwayCsvBean> initializeTableContentFromCsvFile( final File csv) throws IOException {
        final List<RunwayCsvBean> runwaysBean = csvFileService.read(RunwayCsvBean.class, csv);
        final List<Runway> runwaysEntity = runwayMapper.csvBeanToEntity(runwaysBean);
        runwayRepository.save(runwaysEntity);
        return runwaysBean;
    }

    /**
     * Find all runways associated to a certain airport.
     * @param airportRef Airport identification.
     * @return List of {@link RunwayBean} associated to a certain airport.
     */
    public List<RunwayBean> findAllByAirportRef( final Long airportRef ) {
        final List<Runway> entities = runwayRepository.findAllByAirportRef(airportRef);
        final List<RunwayBean> beans = runwayMapper.entityToBean(entities);
        return beans;
    }
}
