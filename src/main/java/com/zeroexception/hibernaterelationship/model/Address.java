package com.zeroexception.hibernaterelationship.model;

import lombok.Getter;

import javax.persistence.Embeddable;

/**
 * @author Viet Quoc Tran vt
 * on 4/14/18.
 * www.zeroexception.com
 */

@Embeddable
public class Address {
    
    @Getter
    private String streetAddress1;
    @Getter
    private String streetAddress2;
    @Getter
    private String city;
    @Getter
    private String zip;

    public Address() {
    }

    public Address setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
        return this;
    }

    public Address setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
        return this;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public Address setZip(String zip) {
        this.zip = zip;
        return this;
    }
}
