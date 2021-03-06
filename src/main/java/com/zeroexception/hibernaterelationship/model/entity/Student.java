package com.zeroexception.hibernaterelationship.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Viet Quoc Tran
 * on 4/14/18.
 * www.zeroexception.com
 */


@Entity
@Table(name = "tb_STUDENT")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Long id;
    @Getter
    private String firstName;
    @Getter
    private String lastName;

    @Getter
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "email", column = @Column(name = "EMAIL")),
            @AttributeOverride(name = "phoneNumber", column = @Column(name = "PHONE_NUMBER"))
    })
    private Contact contact;

    @Getter
    @ElementCollection
    @CollectionTable(
            name = "tb_STUDENT_ADDRESS",
            joinColumns = @JoinColumn(name = "STUDENT_ID")
    )
    private List<Address> addresses;


    @Getter
    @ElementCollection
    @CollectionTable(name = "tb_STUDENT_MAJOR",
            joinColumns = @JoinColumn(name =  "STUDENT_ID"))
    @Column(name = "MAJOR")
    private Set<String> majors;

    @Getter
    @ElementCollection
    @CollectionTable(name = "tb_PREVIOUS_SCHOOL",
        joinColumns = @JoinColumn(name = "STUDENT_ID")
    )
    @MapKeyColumn(name = "SCHOOL_NAME")
    @Column(name = "PREVIOUS_STUDENT_ID")
    private Map<String, String> previousSchools = new HashMap<>();


    @Getter
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENTAL_ID")
    private Parental parental;

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

    public Student setAddresses(List<Address> addresses) {
        this.addresses = addresses;
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

    public Student setPreviousSchools(Map<String, String> previousSchools) {
        this.previousSchools = previousSchools;
        return this;
    }

    public Student setParental(Parental parental) {
        this.parental = parental;
        return this;
    }
}
