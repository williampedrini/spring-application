package com.custodio.spring.application.core.bean;

/**
 * Oject which stores the data of a Runway.
 *
 * @author wcustodio.
 */
public class RunwayBean {

    private Long id;
    private Long airportRef;
    private String airportIdent;
    private Long lengthFt;
    private Long widthFt;
    private String surface;
    private Boolean lighted;
    private Boolean closed;
    private String leIdent;
    private String leLatitudeDeg;
    private String leLongitudeDeg;
    private Long leElevationFt;
    private Double leHeadingDegT;
    private Long leDisplacedThresholdFt;
    private String heIdent;
    private String heLatitudeDeg;
    private String heLongitudeDeg;
    private Long heElevationFt;
    private Double heHeadingDegT;
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