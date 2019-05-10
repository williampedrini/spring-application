package com.custodio.spring.application.core.bean;

import java.util.List;

/**
 * Oject which stores the data of a Country.
 *
 * @author wcustodio.
 */
public class CountryBean {

    private Long id;
    private String code;
    private String name;
    private String continent;
    private String wikipediaLink;
    private String keywords;
    private List<AirportBean> airports;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getWikipediaLink() {
        return wikipediaLink;
    }

    public void setWikipediaLink(String wikipediaLink) {
        this.wikipediaLink = wikipediaLink;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public List<AirportBean> getAirports() {
        return airports;
    }

    public void setAirports( final List<AirportBean> airports ) {
        this.airports = airports;
    }
}
