package com.zeroexception.hibernaterelationship.model.entity;

import lombok.Getter;

import javax.persistence.*;

/**
 * @author Viet Quoc Tran
 * on 4/14/18.
 * www.zeroexception.com
 */

@Entity
@Table(name = "tb_LECTURER")
public class Lecturer {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter
    private String firstName;

    @Getter
    private String lastName;


    public Lecturer() {
    }

    public Lecturer setId(Long id) {
        this.id = id;
        return this;
    }

    public Lecturer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Lecturer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
