package com.custodio.spring.application.core.repository;

import com.custodio.spring.application.core.entity.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * {@link Airport} Data Access Object which contains customized queries.
 *
 * @author wcustodio.
 */
@Repository
public class AirportCustomRepository {

    @Autowired
    private EntityManager entityManager;

    /**
     * Find all the airports associated to a certain country.
     * @param countryName Country name which owns the airports
     * @param countryCode Country code which owns the airports
     * @return List of {@link Airport} associated to a certain country.
     */
    public List<Airport> findAllByCountryNameAndCountryCode( final String countryName, final String countryCode ) {

        final StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("SELECT A.* FROM COUNTRY C INNER JOIN AIRPORT A ON A.ISO_COUNTRY = C.CODE WHERE 1=1 ");
        if ( countryName != null && !countryName.trim().isEmpty() ) {
            queryBuilder.append("AND lower(C.NAME) LIKE lower(:countryName) ");
        }
        if ( countryCode != null && !countryCode.trim().isEmpty() ) {
            queryBuilder.append("AND lower(C.CODE) = lower(:countryCode)");
        }

        final Query query = entityManager.createNativeQuery(queryBuilder.toString(), Airport.class);
        if ( countryName != null && !countryName.trim().isEmpty() ) {
            query.setParameter("countryName", "%" + countryName + "%");
        }
        if ( countryCode != null && !countryCode.trim().isEmpty() ) {
            query.setParameter("countryCode", countryCode);
        }
        return query.getResultList();
    }
}
