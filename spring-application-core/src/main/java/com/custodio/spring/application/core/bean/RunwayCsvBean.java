package com.custodio.spring.application.core.bean;

import com.custodio.spring.application.core.util.NumericBooleanDeserializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Oject which stores the data of a Runway read from a csv file.
 *
 * @author wcustodio.
 */
public class RunwayCsvBean {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("airport_ref")
    private Long airportRef;

    @JsonProperty("airport_ident")
    private String airportIdent;

    @JsonProperty("length_ft")
    private Long lengthFt;

    @JsonProperty("width_ft")
    private Long widthFt;

    @JsonProperty("surface")
    private String surface;

    @JsonProperty("lighted")
    @JsonDeserialize(using=NumericBooleanDeserializer.class)
    private Boolean lighted;

    @JsonProperty("closed")
    @JsonDeserialize(using=NumericBooleanDeserializer.class)
    private Boolean closed;

    @JsonProperty("le_ident")
    private String leIdent;

    @JsonProperty("le_latitude_deg")
    private String leLatitudeDeg;

    @JsonProperty("le_longitude_deg")
    private String leLongitudeDeg;

    @JsonProperty("le_elevation_ft")
    private Long leElevationFt;

    @JsonProperty("le_heading_degT")
    private Double leHeadingDegT;

    @JsonProperty("le_displaced_threshold_ft")
    private Long leDisplacedThresholdFt;

    @JsonProperty("he_ident")
    private String heIdent;

    @JsonProperty("he_latitude_deg")
    private String heLatitudeDeg;

    @JsonProperty("he_longitude_deg")
    private String heLongitudeDeg;

    @JsonProperty("he_elevation_ft")
    private Long heElevationFt;

    @JsonProperty("he_heading_degT")
    private Double heHeadingDegT;

    @JsonProperty("he_displaced_threshold_ft")
    private Long heDisplacedThresholdFt;

    public Long getId() {
        return id;
    }

    public void setId( final Long id ) {
        this.id = id;
    }

    public Long getAirportRef() {
        return airportRef;
    }

    public void setAirportRef( final Long airportRef ) {
        this.airportRef = airportRef;
    }

    public String getAirportIdent() {
        return airportIdent;
    }

    public void setAirportIdent( final String airportIdent ) {
        this.airportIdent = airportIdent;
    }

    public Long getLengthFt() {
        return lengthFt;
    }

    public void setLengthFt( final Long lengthFt ) {
        this.lengthFt = lengthFt;
    }

    public Long getWidthFt() {
        return widthFt;
    }

    public void setWidthFt( final Long widthFt ) {
        this.widthFt = widthFt;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface( final String surface ) {
        this.surface = surface;
    }

    public Boolean getLighted() {
        return lighted;
    }

    public void setLighted( final Boolean lighted ) {
        this.lighted = lighted;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed( final Boolean closed ) {
        this.closed = closed;
    }

    public String getLeIdent() {
        return leIdent;
    }

    public void setLeIdent( final String leIdent ) {
        this.leIdent = leIdent;
    }

    public String getLeLatitudeDeg() {
        return leLatitudeDeg;
    }

    public void setLeLatitudeDeg( final String leLatitudeDeg ) {
        this.leLatitudeDeg = leLatitudeDeg;
    }

    public String getLeLongitudeDeg() {
        return leLongitudeDeg;
    }

    public void setLeLongitudeDeg( final String leLongitudeDeg ) {
        this.leLongitudeDeg = leLongitudeDeg;
    }

    public Long getLeElevationFt() {
        return leElevationFt;
    }

    public void setLeElevationFt( final Long leElevationFt ) {
        this.leElevationFt = leElevationFt;
    }

    public Double getLeHeadingDegT() {
        return leHeadingDegT;
    }

    public void setLeHeadingDegT( final Double leHeadingDegT ) {
        this.leHeadingDegT = leHeadingDegT;
    }

    public Long getLeDisplacedThresholdFt() {
        return leDisplacedThresholdFt;
    }

    public void setLeDisplacedThresholdFt( final Long leDisplacedThresholdFt ) {
        this.leDisplacedThresholdFt = leDisplacedThresholdFt;
    }

    public String getHeIdent() {
        return heIdent;
    }

    public void setHeIdent( final String heIdent ) {
        this.heIdent = heIdent;
    }

    public String getHeLatitudeDeg() {
        return heLatitudeDeg;
    }

    public void setHeLatitudeDeg( final String heLatitudeDeg ) {
        this.heLatitudeDeg = heLatitudeDeg;
    }

    public String getHeLongitudeDeg() {
        return heLongitudeDeg;
    }

    public void setHeLongitudeDeg( final String heLongitudeDeg ) {
        this.heLongitudeDeg = heLongitudeDeg;
    }

    public Long getHeElevationFt() {
        return heElevationFt;
    }

    public void setHeElevationFt( final Long heElevationFt ) {
        this.heElevationFt = heElevationFt;
    }

    public Double getHeHeadingDegT() {
        return heHeadingDegT;
    }

    public void setHeHeadingDegT( final Double heHeadingDegT ) {
        this.heHeadingDegT = heHeadingDegT;
    }

    public Long getHeDisplacedThresholdFt() {
        return heDisplacedThresholdFt;
    }

    public void setHeDisplacedThresholdFt( final Long heDisplacedThresholdFt ) {
        this.heDisplacedThresholdFt = heDisplacedThresholdFt;
    }
}