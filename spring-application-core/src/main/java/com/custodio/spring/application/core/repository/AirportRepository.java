package com.custodio.spring.application.core.repository;

import com.custodio.spring.application.core.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * {@link Airport} Data Access Object.
 *
 * @author wcustodio.
 */
@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
}