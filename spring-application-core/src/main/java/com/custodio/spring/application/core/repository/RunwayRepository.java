package com.custodio.spring.application.core.repository;

import com.custodio.spring.application.core.entity.Runway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * {@link Runway} Data Access Object.
 *
 * @author wcustodio.
 */
@Repository
public interface RunwayRepository extends JpaRepository<Runway, Long> {

    /**
     * Find all runways associated to a certain airport.
     * @param airportRef Airport identification.
     * @return List of {@link Runway} associated to a certain airport.
     */
    @Query(value = "select r from Runway r where r.airport.id = :airportRef")
    List<Runway> findAllByAirportRef( @Param("airportRef") Long airportRef );
}
