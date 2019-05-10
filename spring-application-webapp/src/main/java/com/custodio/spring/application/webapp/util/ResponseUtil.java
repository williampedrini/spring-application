package com.custodio.spring.application.webapp.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;

/**
 * Class responsible for exposing util methods related to the build of a response for a {@link org.springframework.stereotype.Controller}.
 *
 * @author wcustodio
 */
@Service
public class ResponseUtil {

    /**
     * Build a {@link ResponseEntity} according to {@link Object} and {@link Errors}
     * @param object Object to be inserted into the response.
     * @param errors Object with the validation data.
     * @return If there is any kind of error a {@link ResponseEntity} will be returned with the {@link HttpStatus} as 400 - BAD_REQUEST.
     *         If there is not any kind of error a {@link ResponseEntity} will be returned with the {@link HttpStatus} as 200 - OK.
     *         If a {@link JsonProcessingException} is thrown a {@link ResponseEntity} will be returned with the {@link HttpStatus} as 500 - INTERNAL_SERVER_ERROR.
     */
    public ResponseEntity getResponse( final Object object, final Errors errors ) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            if ( !errors.hasErrors() ) {
                return new ResponseEntity(mapper.writeValueAsString(object), HttpStatus.OK);
            } else {
                return new ResponseEntity(mapper.writeValueAsString(object), HttpStatus.BAD_REQUEST);
            }
        } catch (JsonProcessingException jsonProcessingException) {
            return new ResponseEntity(jsonProcessingException.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Get all the error messages from a {@link Errors}.
     * @param errors Objeto with validation errors.
     * @return List with all error messages.
     */
    public List<String> getErrorMessages( final Errors errors ) {
        final List<String> validtionErrors = new ArrayList<>();
        for (final ObjectError error : errors.getAllErrors()) {
            validtionErrors.add(error.getDefaultMessage());
        }
        return validtionErrors;
    }
}
