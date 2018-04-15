package com.zeroexception.hibernaterelationship.model;

import lombok.Getter;

import javax.persistence.Embeddable;

/**
 * @author Viet Quoc Tran vt
 * on 4/14/18.
 * www.zeroexception.com
 */


@Embeddable
public class Contact {

    @Getter
    private String email;
    @Getter
    private String phoneNumber;

    public Contact() {
    }

    public Contact setEmail(String email) {
        this.email = email;
        return this;
    }

    public Contact setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
