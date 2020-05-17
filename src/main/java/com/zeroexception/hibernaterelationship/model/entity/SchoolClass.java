package com.zeroexception.hibernaterelationship.model.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 * @author Viet Quoc Tran
 * on 4/14/18.
 * www.zeroexception.com
 */


@Entity
@Table(name = "tb_CLASS")
public class SchoolClass {

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

    public SchoolClass() {
    }

    public SchoolClass setId(Long id) {
        Id = id;
        return this;
    }

    public SchoolClass setSubject(String subject) {
        this.subject = subject;
        return this;
    }

//    public SchoolClass setLecturer(Lecturer lecturer) {
//        this.lecturer = lecturer;
//        return this;
//    }

//    public SchoolClass setStudents(List<Student> students) {
//        this.students = students;
//        return this;
//    }
    
    
    
}
