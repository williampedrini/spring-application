package com.custodio.spring.application.core.mapper;

import com.custodio.spring.application.core.bean.RunwayBean;
import com.custodio.spring.application.core.bean.RunwayCsvBean;
import com.custodio.spring.application.core.entity.Airport;
import com.custodio.spring.application.core.entity.Runway;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Class responsible for mapping all content of the objects {@link RunwayCsvBean}, {@link RunwayBean} and {@link Runway}.
 *
 * @author wcustodio
 */
@Service
public class RunwayMapper {

    /**
     * Convert a certain {@link RunwayCsvBean} element to {@link Runway}.
     * @param bean Object to be converted.
     * @return Object with the converted data.
     */
    public Runway csvBeanToEntity( final RunwayCsvBean bean ) {
        Runway entity = null;
        if ( bean != null ) {
            entity = new Runway();
            entity.setId(bean.getId());
            entity.setAirportIdent(bean.getAirportIdent());
            entity.setLengthFt(bean.getLengthFt());
            entity.setWidthFt(bean.getWidthFt());
            entity.setSurface(bean.getSurface());
            entity.setLighted(bean.getLighted());
            entity.setClosed(bean.getClosed());
            entity.setLeIdent(bean.getLeIdent());
            entity.setLeLatitudeDeg(bean.getLeLatitudeDeg());
            entity.setLeLongitudeDeg(bean.getLeLongitudeDeg());
            entity.setLeElevationFt(bean.getLeElevationFt());
            entity.setLeHeadingDegT(bean.getLeHeadingDegT());
            entity.setLeDisplacedThresholdFt(bean.getLeDisplacedThresholdFt());
            entity.setHeIdent(bean.getHeIdent());
            entity.setHeLatitudeDeg(bean.getHeLatitudeDeg());
            entity.setHeLongitudeDeg(bean.getHeLongitudeDeg());
            entity.setHeElevationFt(bean.getHeElevationFt());
            entity.setHeHeadingDegT(bean.getHeHeadingDegT());
            entity.setHeDisplacedThresholdFt(bean.getHeDisplacedThresholdFt());

            final Airport airport = new Airport();
            airport.setId(bean.getAirportRef());
            entity.setAirport(airport);
        }
        return entity;
    }

    /**
     * Convert a certain list of {@link RunwayCsvBean} to a list of {@link Runway}.
     * @param beans Objects to be converted.
     * @return Object with the converted data.
     */
    public List<Runway> csvBeanToEntity( final List<RunwayCsvBean> beans ) {
        List<Runway> entities = null;
        if ( beans != null ) {
            entities = new ArrayList<Runway>();
            for (final RunwayCsvBean bean : beans) {
                entities.add(csvBeanToEntity(bean));
            }
        }
        return entities;
    }

    /**
     * Convert a certain {@link Runway} element to {@link RunwayBean}.
     * @param entity Object to be converted.
     * @return Object with the converted data.
     */
    public RunwayBean entityToBean( final Runway entity ) {
        RunwayBean bean = null;
        if ( entity != null ) {
            bean = new RunwayBean();
            bean.setId(entity.getId());
            bean.setAirportIdent(entity.getAirportIdent());
            bean.setLengthFt(entity.getLengthFt());
            bean.setWidthFt(entity.getWidthFt());
            bean.setSurface(entity.getSurface());
            bean.setLighted(entity.getLighted());
            bean.setClosed(entity.getClosed());
            bean.setLeIdent(entity.getLeIdent());
            bean.setLeLatitudeDeg(entity.getLeLatitudeDeg());
            bean.setLeLongitudeDeg(entity.getLeLongitudeDeg());
            bean.setLeElevationFt(entity.getLeElevationFt());
            bean.setLeHeadingDegT(entity.getLeHeadingDegT());
            bean.setLeDisplacedThresholdFt(entity.getLeDisplacedThresholdFt());
            bean.setHeIdent(entity.getHeIdent());
            bean.setHeLatitudeDeg(entity.getHeLatitudeDeg());
            bean.setHeLongitudeDeg(entity.getHeLongitudeDeg());
            bean.setHeElevationFt(entity.getHeElevationFt());
            bean.setHeHeadingDegT(entity.getHeHeadingDegT());
            bean.setHeDisplacedThresholdFt(entity.getHeDisplacedThresholdFt());

            final Airport airport = entity.getAirport();
            bean.setAirportRef(airport.getId());
        }
        return bean;
    }

    /**
     * Convert a certain list of {@link Runway} to a list of {@link RunwayBean}.
     * @param entities Objects to be converted.
     * @return Object with the converted data.
     */
    public List<RunwayBean> entityToBean( final List<Runway> entities ) {
        List<RunwayBean> beans = null;
        if ( entities != null ) {
            beans = new ArrayList<RunwayBean>();
            for (final Runway entity : entities) {
                beans.add(entityToBean(entity));
            }
        }
        return beans;
    }
}
