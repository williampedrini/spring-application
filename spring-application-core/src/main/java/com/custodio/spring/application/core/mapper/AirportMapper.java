package com.custodio.spring.application.core.mapper;

import com.custodio.spring.application.core.bean.AirportBean;
import com.custodio.spring.application.core.bean.AirportCsvBean;
import com.custodio.spring.application.core.entity.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Class responsible for mapping all content of the objects {@link AirportCsvBean}, {@link AirportBean} and {@link Airport}.
 *
 * @author wcustodio
 */
@Service
public class AirportMapper {

    @Autowired
    private RunwayMapper runwayMapper;

    /**
     * Convert a certain {@link AirportCsvBean} element to {@link Airport}.
     * @param bean Object to be converted.
     * @return Object with the converted data.
     */
    public Airport csvBeanToEntity( final AirportCsvBean bean ) {
        Airport entity = null;
        if ( bean != null ) {
            entity = new Airport();
            entity.setId(bean.getId());
            entity.setIdent(bean.getIdent());
            entity.setType(bean.getType());
            entity.setName(bean.getName());
            entity.setLatitudeDeg(bean.getLatitudeDeg());
            entity.setLongitudeDeg(bean.getLongitudeDeg());
            entity.setElevationFt(bean.getElevationFt());
            entity.setContinent(bean.getContinent());
            entity.setIsoCountry(bean.getIsoCountry());
            entity.setIsoRegion(bean.getIsoRegion());
            entity.setMunicipality(bean.getMunicipality());
            entity.setScheduledService(bean.getScheduledService());
            entity.setGpsCode(bean.getGpsCode());
            entity.setIataCode(bean.getIataCode());
            entity.setLocalCode(bean.getLocalCode());
            entity.setHomeLink(bean.getHomeLink());
            entity.setWikipediaLink(bean.getWikipediaLink());
            entity.setKeywords(bean.getKeywords());
        }
        return entity;
    }

    /**
     * Convert a certain list of {@link AirportCsvBean} to a list of {@link Airport}.
     * @param beans Objects to be converted.
     * @return Object with the converted data.
     */
    public List<Airport> csvBeanToEntity( final List<AirportCsvBean> beans ) {
        List<Airport> entities = null;
        if ( beans != null ) {
            entities = new ArrayList<Airport>();
            for (final AirportCsvBean bean : beans) {
                entities.add(csvBeanToEntity(bean));
            }
        }
        return entities;
    }

    /**
     * Convert a certain {@link Airport} element to {@link AirportBean}.
     * @param entity Object to be converted.
     * @return Object with the converted data.
     */
    public AirportBean entityToBean( final Airport entity ) {
        AirportBean bean = null;
        if ( entity != null ) {
            bean = new AirportBean();
            bean.setId(entity.getId());
            bean.setIdent(entity.getIdent());
            bean.setType(entity.getType());
            bean.setName(entity.getName());
            bean.setLatitudeDeg(entity.getLatitudeDeg());
            bean.setLongitudeDeg(entity.getLongitudeDeg());
            bean.setElevationFt(entity.getElevationFt());
            bean.setContinent(entity.getContinent());
            bean.setIsoCountry(entity.getIsoCountry());
            bean.setIsoRegion(entity.getIsoRegion());
            bean.setMunicipality(entity.getMunicipality());
            bean.setScheduledService(entity.getScheduledService());
            bean.setGpsCode(entity.getGpsCode());
            bean.setIataCode(entity.getIataCode());
            bean.setLocalCode(entity.getLocalCode());
            bean.setHomeLink(entity.getHomeLink());
            bean.setWikipediaLink(entity.getWikipediaLink());
            bean.setKeywords(entity.getKeywords());
            bean.setRunways(runwayMapper.entityToBean(entity.getRunways()));
        }
        return bean;
    }

    /**
     * Convert a certain list of {@link Airport} to a list of {@link AirportBean}.
     * @param entities Objects to be converted.
     * @return Object with the converted data.
     */
    public List<AirportBean> entityToBean( final List<Airport> entities ) {
        List<AirportBean> beans = null;
        if ( entities != null ) {
            beans = new ArrayList<AirportBean>();
            for (final Airport entity : entities) {
                beans.add(entityToBean(entity));
            }
        }
        return beans;
    }
}
