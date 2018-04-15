package com.zeroexception.hibernaterelationship.model;

import lombok.Getter;

import javax.persistence.*;

/**
 * @author Viet Quoc Tran vt
 * on 4/14/18.
 * www.zeroexception.com
 */


@Entity
@Table(name = "tb_STUDENT")
public class Student {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Getter
    private String firstName;
    @Getter
    private String lastName;

    @Getter
    @Embedded
    private Address address;

    @Getter
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "email", column = @Column(name = "EMAIL")),
            @AttributeOverride(name = "phoneNumber", column = @Column(name = "PHONE_NUMBER"))
    })
    private Contact contact;

    public Student() {
    }

    public Student setId(Long id) {
        this.id = id;
        return this;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Student setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Student setContact(Contact contact) {
        this.contact = contact;
        return this;
    }
}
