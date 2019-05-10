package com.custodio.spring.application.webapp.controller;

import com.custodio.spring.application.core.entity.Country;
import com.custodio.spring.application.webapp.service.country.FindCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Entry point for methods related to {@link Country}.
 *
 * @author wcustodio.
 */
@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private FindCountryService findCountryService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity findAll() {
        return findCountryService.findAll();
    }
}
