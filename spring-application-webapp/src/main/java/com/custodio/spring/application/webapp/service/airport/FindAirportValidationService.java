package com.custodio.spring.application.webapp.service.airport;

import com.custodio.spring.application.webapp.bean.FindAirportRequestBean;
import com.custodio.spring.application.webapp.bean.FindAirportResponseBean;
import com.custodio.spring.application.webapp.enumerable.FindAirportValidationMessage;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Class responsible for executing validations over a objeto {@link FindAirportRequestBean}.
 *
 * @author wcustodio.
 */
@Service
public class FindAirportValidationService implements Validator {

    @Override
    public boolean supports( final Class<?> clazz ) {
        return FindAirportResponseBean.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate( final Object target, final Errors errors ) {
        FindAirportRequestBean request = (FindAirportRequestBean) target;
        if ( request == null ||((request.getCountryName() == null || request.getCountryName().trim().isEmpty())
              && (request.getCountryCode() == null || request.getCountryCode().trim().isEmpty())) ) {
            errors.reject(FindAirportValidationMessage.LACK_OF_PARAMETER.getCode(), FindAirportValidationMessage.LACK_OF_PARAMETER.getMessage());
        }
    }
}
