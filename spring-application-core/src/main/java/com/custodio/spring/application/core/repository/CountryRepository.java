package com.custodio.spring.application.core.repository;

import com.custodio.spring.application.core.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * {@link Country} Data Access Object.
 *
 * @author wcustodio.
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}