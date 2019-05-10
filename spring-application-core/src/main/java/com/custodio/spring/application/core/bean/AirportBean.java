package com.custodio.spring.application.core.bean;

import java.util.List;

/**
 * Oject which stores the data of an Airport.
 *
 * @author wcustodio.
 */
public class AirportBean {

    private Long id;
    private String ident;
    private String type;
    private String name;
    private String latitudeDeg;
    private String longitudeDeg;
    private Long elevationFt;
    private String continent;
    private String isoCountry;
    private String isoRegion;
    private String municipality;
    private Boolean scheduledService;
    private String gpsCode;
    private String iataCode;
    private String localCode;
    private String homeLink;
    private String wikipediaLink;
    private String keywords;
    private List<RunwayBean> runways;

    public Long getId() {
        return id;
    }

    public void setId( final Long id ) {
        this.id = id;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent( final String ident ) {
        this.ident = ident;
    }

    public String getType() {
        return type;
    }

    public void setType( final String type ) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName( final String name ) {
        this.name = name;
    }

    public String getLatitudeDeg() {
        return latitudeDeg;
    }

    public void setLatitudeDeg( final String latitudeDeg ) {
        this.latitudeDeg = latitudeDeg;
    }

    public String getLongitudeDeg() {
        return longitudeDeg;
    }

    public void setLongitudeDeg( final String longitudeDeg ) {
        this.longitudeDeg = longitudeDeg;
    }

    public Long getElevationFt() {
        return elevationFt;
    }

    public void setElevationFt( final Long elevationFt ) {
        this.elevationFt = elevationFt;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent( final String continent ) {
        this.continent = continent;
    }

    public String getIsoCountry() {
        return isoCountry;
    }

    public void setIsoCountry( final String isoCountry ) {
        this.isoCountry = isoCountry;
    }

    public String getIsoRegion() {
        return isoRegion;
    }

    public void setIsoRegion( final String isoRegion ) {
        this.isoRegion = isoRegion;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality( final String municipality ) {
        this.municipality = municipality;
    }

    public Boolean getScheduledService() {
        return scheduledService;
    }

    public void setScheduledService( final Boolean scheduledService ) {
        this.scheduledService = scheduledService;
    }

    public String getGpsCode() {
        return gpsCode;
    }

    public void setGpsCode( final String gpsCode ) {
        this.gpsCode = gpsCode;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode( final String iataCode ) {
        this.iataCode = iataCode;
    }

    public String getLocalCode() {
        return localCode;
    }

    public void setLocalCode( final String localCode ) {
        this.localCode = localCode;
    }

    public String getHomeLink() {
        return homeLink;
    }

    public void setHomeLink( final String homeLink ) {
        this.homeLink = homeLink;
    }

    public String getWikipediaLink() {
        return wikipediaLink;
    }

    public void setWikipediaLink( final String wikipediaLink ) {
        this.wikipediaLink = wikipediaLink;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords( final String keywords ) {
        this.keywords = keywords;
    }

    public List<RunwayBean> getRunways() {
        return runways;
    }

    public void setRunways( final List<RunwayBean> runways ) {
        this.runways = runways;
    }
}
