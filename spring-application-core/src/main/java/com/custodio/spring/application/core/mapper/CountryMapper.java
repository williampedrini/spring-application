package com.custodio.spring.application.core.mapper;

import com.custodio.spring.application.core.bean.CountryCsvBean;
import com.custodio.spring.application.core.bean.CountryBean;
import com.custodio.spring.application.core.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Class responsible for mapping all content of the objects {@link CountryCsvBean}, {@link CountryBean} and {@link Country}.
 *
 * @author wcustodio
 */
@Service
public class CountryMapper {

    @Autowired
    private AirportMapper airportMapper;

    /**
     * Convert a certain {@link CountryCsvBean} element to {@link Country}.
     * @param bean Object to be converted.
     * @return Object with the converted data.
     */
    public Country csvBeanToEntity( final CountryCsvBean bean ) {
        Country entity = null;
        if ( bean != null ) {
            entity = new Country();
            entity.setId(bean.getId());
            entity.setCode(bean.getCode());
            entity.setContinent(bean.getContinent());
            entity.setKeywords(bean.getKeywords());
            entity.setName(bean.getName());
            entity.setWikipediaLink(bean.getWikipediaLink());
        }
        return entity;
    }

    /**
     * Convert a certain list of {@link CountryCsvBean} to a list of {@link Country}.
     * @param beans Objects to be converted.
     * @return Object with the converted data.
     */
    public List<Country> csvBeanToEntity( final List<CountryCsvBean> beans ) {
        List<Country> entities = null;
        if ( beans != null ) {
            entities = new ArrayList<Country>();
            for (final CountryCsvBean bean : beans) {
                entities.add(csvBeanToEntity(bean));
            }
        }
        return entities;
    }

    /**
     * Convert a certain {@link Country} element to {@link CountryBean}.
     * @param entity Object to be converted.
     * @return Object with the converted data.
     */
    public CountryBean entityToBean( final Country entity ) {
        CountryBean bean = null;
        if ( entity != null ) {
            bean = new CountryBean();
            bean.setId(entity.getId());
            bean.setCode(entity.getCode());
            bean.setContinent(entity.getContinent());
            bean.setKeywords(entity.getKeywords());
            bean.setName(entity.getName());
            bean.setWikipediaLink(entity.getWikipediaLink());
            bean.setAirports(airportMapper.entityToBean(entity.getAirports()));
        }
        return bean;
    }

    /**
     * Convert a certain list of {@link Country} to a list of {@link CountryBean}.
     * @param entities Objects to be converted.
     * @return Object with the converted data.
     */
    public List<CountryBean> entityToBean( final List<Country> entities ) {
        List<CountryBean> beans = null;
        if ( entities != null ) {
            beans = new ArrayList<CountryBean>();
            for (final Country entity : entities) {
                beans.add(entityToBean(entity));
            }
        }
        return beans;
    }
}
