package com.zeroexception.hibernaterelationship.model;

import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

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

    @Getter
    @ElementCollection
    @CollectionTable(name = "STUDENT_MAJOR",
            joinColumns = @JoinColumn(name =  "STUDENT_ID"))
    @Column(name = "MAJOR")
    private Set<String> majors;


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

    public Student setMajors(Set<String> majors) {
        this.majors = majors;
        return this;
    }
}
