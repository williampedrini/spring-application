package com.custodio.spring.application.webapp.enumerable;

import com.custodio.spring.application.webapp.service.airport.FindAirportValidationService;

/**
 * Catalog with all the existing error messages used by the {@link FindAirportValidationService}.
 *
 * @author wcustodio.
 */
public enum FindAirportValidationMessage {

    LACK_OF_PARAMETER("-99","At least one parameter is necessary.");

    private String code;

    private String message;

    FindAirportValidationMessage( final String code, final String message ) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static String getMessage( final String code ) {
        for (final FindAirportValidationMessage error : FindAirportValidationMessage.values()) {
            if ( code.equals(error.code) ) {
                return error.getMessage();
            }
        }
        return null;
    }
}