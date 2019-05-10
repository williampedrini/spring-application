package com.custodio.spring.application.core.service;

import com.custodio.spring.application.core.bean.CountryBean;
import com.custodio.spring.application.core.bean.CountryCsvBean;
import com.custodio.spring.application.core.entity.Country;
import com.custodio.spring.application.core.mapper.CountryMapper;
import com.custodio.spring.application.core.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Service responsible for executing procedures related to a country.
 *
 * @author wcustodio.
 */
@Service
@Transactional
public class CountryService {

    @Autowired
    private CsvFileService csvFileService;

    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private CountryRepository countryRepository;

    /**
     * Read all content from a specific csv file which contains information about countries.
     * @param csv File to be read.
     * @return List of {@link CountryCsvBean} with all countries from the csv file persisted into database.
     * @throws IOException Error while trying to read the csv file.
     */
    public List<CountryCsvBean> initializeTableContentFromCsvFile( final File csv) throws IOException {
        final List<CountryCsvBean> countriesBean = csvFileService.read(CountryCsvBean.class, csv);
        final List<Country> countriesEntity = countryMapper.csvBeanToEntity(countriesBean);
        countryRepository.save(countriesEntity);
        return countriesBean;
    }

    /**
     * Find all exiting countries in database.
     * @return List of {@link CountryBean}.
     */
    public List<CountryBean> findAll(){
        final List<Country> entities = countryRepository.findAll();
        final List<CountryBean> beans = countryMapper.entityToBean(entities);
        return beans;
    }
}
