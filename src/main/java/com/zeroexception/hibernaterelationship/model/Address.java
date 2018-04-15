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
    private String addressLine1;
    @Getter
    private String addressLine2;
    @Getter
    private String city;
    @Getter
    private String state;
    @Getter
    private String zip;

    public Address() {
    }

    public Address setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public Address setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }

    public Address setZip(String zip) {
        this.zip = zip;
        return this;
    }
}
