package com.custodio.spring.application.webapp.bean;

/**
 * Oject which stores the data of the request used to search for airports.
 *
 * @author wcustodio.
 */
public class FindAirportRequestBean {

    private String countryName;

    private String countryCode;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName( final String countryName ) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode( final String countryCode ) {
        this.countryCode = countryCode;
    }
}
