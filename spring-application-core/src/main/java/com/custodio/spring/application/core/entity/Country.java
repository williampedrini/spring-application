package com.custodio.spring.application.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Entity which represents the table where the data of a country will be stored.
 *
 * @author wcustodio.
 */
@Entity
@Table(name = "country")
public class Country implements Serializable {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name="code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name="continent")
    private String continent;

    @Column(name="wikipedia_link")
    private String wikipediaLink;

    @Column(name="keywords")
    private String keywords;

    @OneToMany
    @JoinColumn(name="iso_country", referencedColumnName = "code")
    private List<Airport> airports;

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

    public void setKeywords( final String keywords ) {
        this.keywords = keywords;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports( final List<Airport> airports ) {
        this.airports = airports;
    }
}
