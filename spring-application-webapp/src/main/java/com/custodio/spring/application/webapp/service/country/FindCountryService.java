package com.custodio.spring.application.webapp.service.country;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.custodio.spring.application.core.bean.CountryBean;
import com.custodio.spring.application.core.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Class responsible for executing searches for the existing countries in the application.
 *
 * @author wcustodio.
 */
@Service
public class FindCountryService {

    @Autowired
    private CountryService countryService;

    /**
     * Find all the exiting countries in the database.
     * @return {@link ResponseEntity} with the response data.
     */
    public ResponseEntity findAll() {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            final List<CountryBean> countries = countryService.findAll();
            return new ResponseEntity(mapper.writeValueAsString(countries), HttpStatus.OK);
        } catch (Exception exception) {
            return new ResponseEntity(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}