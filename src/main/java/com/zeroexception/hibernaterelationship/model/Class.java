package com.zeroexception.hibernaterelationship.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * @author Viet Quoc Tran vt
 * on 4/14/18.
 * www.zeroexception.com
 */


@Entity
@Table(name = "tb_CLASS")
public class Class {

    @Getter
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @Getter
    private String subject;
//    @Getter
//    private Lecturer lecturer;

//    @Getter
//    private List<Student> students;

    public Class() {
    }

    public Class setId(Long id) {
        Id = id;
        return this;
    }

    public Class setSubject(String subject) {
        this.subject = subject;
        return this;
    }

//    public Class setLecturer(Lecturer lecturer) {
//        this.lecturer = lecturer;
//        return this;
//    }

//    public Class setStudents(List<Student> students) {
//        this.students = students;
//        return this;
//    }
    
    
    
}
