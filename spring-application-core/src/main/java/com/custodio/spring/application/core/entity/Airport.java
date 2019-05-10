package com.custodio.spring.application.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Entity which represents the table where the data of an airport will be stored.
 *
 * @author wcustodio.
 */
@Entity
@Table(name = "airport")
public class Airport implements Serializable {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name="ident")
    private String ident;

    @Column(name="type")
    private String type;

    @Column(name="name")
    private String name;

    @Column(name="latitude_deg")
    private String latitudeDeg;

    @Column(name="longitude_deg")
    private String longitudeDeg;

    @Column(name="elevation_ft")
    private Long elevationFt;

    @Column(name="continent")
    private String continent;

    @Column(name="iso_country")
    private String isoCountry;

    @Column(name="iso_region")
    private String isoRegion;

    @Column(name="municipality")
    private String municipality;

    @Column(name="scheduled_service")
    private Boolean scheduledService;

    @Column(name="gps_code")
    private String gpsCode;

    @Column(name="iata_code")
    private String iataCode;

    @Column(name="local_code")
    private String localCode;

    @Column(name="home_link")
    private String homeLink;

    @Column(name="wikipedia_link")
    private String wikipediaLink;

    @Column(name="keywords")
    private String keywords;

    @OneToMany(mappedBy = "airport")
    private List<Runway> runways;

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

    public List<Runway> getRunways() {
        return runways;
    }

    public void setRunways( final List<Runway> runways ) {
        this.runways = runways;
    }
}