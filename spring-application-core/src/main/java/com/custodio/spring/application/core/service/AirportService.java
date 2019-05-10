package com.custodio.spring.application.core.service;


import com.custodio.spring.application.core.bean.AirportBean;
import com.custodio.spring.application.core.bean.AirportCsvBean;
import com.custodio.spring.application.core.entity.Airport;
import com.custodio.spring.application.core.mapper.AirportMapper;
import com.custodio.spring.application.core.repository.AirportCustomRepository;
import com.custodio.spring.application.core.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Service responsible for executing procedures related to an airport.
 *
 * @author wcustodio.
 */
@Service
@Transactional
public class AirportService {

    @Autowired
    private CsvFileService csvFileService;

    @Autowired
    private AirportMapper airportMapper;

    @Autowired
    private AirportRepository airportRepository;

    @Autowired
    private AirportCustomRepository airportCustomRepository;

    /**
     * Read all content from a specific csv file which contains information about airports.
     * @param csv File to be read.
     * @return List of {@link AirportCsvBean} with all airports from the csv file persisted into database.
     * @throws IOException Error while trying to read the csv file.
     */
    public List<AirportCsvBean> initializeTableContentFromCsvFile( final File csv) throws IOException {
        final List<AirportCsvBean> airportsBean = csvFileService.read(AirportCsvBean.class, csv);
        final List<Airport> airportsEntity = airportMapper.csvBeanToEntity(airportsBean);
        airportRepository.save(airportsEntity);
        return airportsBean;
    }

    /**
     * Find all the airports associated to a certain country. If no parameter is passed as argument it will return all the airports from database.
     * @param countryName Country name which owns the airports
     * @param countryCode Country code which owns the airports
     * @return List of {@link AirportBean} associated to a certain country.
     */
    public List<AirportBean> findAllByCountryNameAndCountryCode( final String countryName, final String countryCode ) {
        final List<Airport> airports = airportCustomRepository.findAllByCountryNameAndCountryCode(countryName,countryCode);
        final List<AirportBean> airportsBean = airportMapper.entityToBean(airports);
        return airportsBean;
    }

    /**
     * Find a specific airport by a certain id.
     * @param id Number which identifies the airport.
     * @return {@link AirportBean} with the airport data.
     */
    public AirportBean findById( final Long id ) {
        final Airport airport = airportRepository.findOne(id);
        final AirportBean airportBean = airportMapper.entityToBean(airport);
        return airportBean;
    }
}
