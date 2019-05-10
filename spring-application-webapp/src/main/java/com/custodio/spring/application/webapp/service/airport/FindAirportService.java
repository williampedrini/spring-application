package com.custodio.spring.application.webapp.service.airport;

import com.custodio.spring.application.core.service.AirportService;
import com.custodio.spring.application.webapp.bean.FindAirportResponseBean;
import com.custodio.spring.application.webapp.util.ResponseUtil;
import com.custodio.spring.application.webapp.bean.FindAirportRequestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

/**
 * Class responsible for executing searches for the existing airports in the application.
 *
 * @author wcustodio.
 */
@Service
public class FindAirportService {

    @Autowired
    private ResponseUtil responseUtil;

    @Autowired
    private AirportService airportService;

    @Autowired
    private FindAirportValidationService findAirportValidationService;

    /**
     * Find all the airports associated to a certain country.
     * @param request The parameters used in the request.
     * @param errors Objeto where the errors will be inserted.
     * @return {@link ResponseEntity} with the response data.
     */
    public ResponseEntity findAllByCountryNameAndCountryCode( final FindAirportRequestBean request, final Errors errors ) {
        findAirportValidationService.validate(request, errors);
        final FindAirportResponseBean response = new FindAirportResponseBean();
        if ( !errors.hasErrors() ) {
            response.setAirports(airportService.findAllByCountryNameAndCountryCode(request.getCountryName(),request.getCountryCode()));
        } else {
            response.setErrors(responseUtil.getErrorMessages(errors));
        }
        return responseUtil.getResponse(response, errors);
    }
}