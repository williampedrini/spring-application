package com.custodio.spring.application.webapp.bean;

import com.custodio.spring.application.core.bean.AirportBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Oject which stores the data of the response used to search for airports.
 *
 * @author wcustodio.
 */
public class FindAirportResponseBean {

    private List<AirportBean> airports = new ArrayList<>();

    private List<String> errors = new ArrayList<>();

    public List<AirportBean> getAirports() {
        return airports;
    }

    public void setAirports( final List<AirportBean> airports ) {
        this.airports = airports;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors( final List<String> errors ) {
        this.errors = errors;
    }
}
