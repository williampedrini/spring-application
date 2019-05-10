package com.custodio.spring.application.core.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Entity which represents the table where the data of a runway will be stored.
 *
 * @author wcustodio.
 */
@Entity
@Table(name = "runway")
public class Runway implements Serializable {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name="airport_ident")
    private String airportIdent;

    @Column(name="length_ft")
    private Long lengthFt;

    @Column(name="width_ft")
    private Long widthFt;

    @Column(name="surface")
    private String surface;

    @Column(name="lighted")
    private Boolean lighted;

    @Column(name="closed")
    private Boolean closed;

    @Column(name="le_ident")
    private String leIdent;

    @Column(name="le_latitude_deg")
    private String leLatitudeDeg;

    @Column(name="le_longitude_deg")
    private String leLongitudeDeg;

    @Column(name="le_elevation_ft")
    private Long leElevationFt;

    @Column(name="le_heading_degT")
    private Double leHeadingDegT;

    @Column(name="le_displaced_threshold_ft")
    private Long leDisplacedThresholdFt;

    @Column(name="he_ident")
    private String heIdent;

    @Column(name="he_latitude_deg")
    private String heLatitudeDeg;

    @Column(name="he_longitude_deg")
    private String heLongitudeDeg;

    @Column(name="he_elevation_ft")
    private Long heElevationFt;

    @Column(name="he_heading_degT")
    private Double heHeadingDegT;

    @Column(name="he_displaced_threshold_ft")
    private Long heDisplacedThresholdFt;

    @ManyToOne
    @JoinColumn(name = "airport_ref")
    private Airport airport;

    public Long getId() {
        return id;
    }

    public void setId( final Long id ) {
        this.id = id;
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

    public Airport getAirport() {
        return airport;
    }

    public void setAirport( final Airport airport ) {
        this.airport = airport;
    }
}
