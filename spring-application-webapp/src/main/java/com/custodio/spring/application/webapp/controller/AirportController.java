package com.custodio.spring.application.webapp.controller;

import com.custodio.spring.application.core.entity.Airport;
import com.custodio.spring.application.webapp.service.airport.FindAirportService;
import com.custodio.spring.application.webapp.bean.FindAirportRequestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Entry point for methods related to {@link Airport}.
 *
 * @author wcustodio.
 */
@RestController
@RequestMapping("/airport")
public class AirportController {

    @Autowired
    private FindAirportService findAirportService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity findAllByCriteria( @ModelAttribute("criteria") FindAirportRequestBean request, BindingResult result) {
        return findAirportService.findAllByCountryNameAndCountryCode(request, result);
    }
}
