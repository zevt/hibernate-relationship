package com.zeroexception.hibernaterelationship.controller;

import com.zeroexception.hibernaterelationship.model.entity.Parental;
import com.zeroexception.hibernaterelationship.model.entity.Student;
import com.zeroexception.hibernaterelationship.repository.ParentalRepository;
import com.zeroexception.hibernaterelationship.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Viet Quoc Tran
 * on 4/15/18.
 * www.zeroexception.com
 */


@RestController
@RequestMapping("/v1")
public class EntityApi {

    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private ParentalRepository parentalRepo;

    @GetMapping("/students")
    public ResponseEntity<?> getStudents() {
        List<Student> students = this.studentRepo.findAll();
        Parental parental = students.get(0).getParental();
        System.out.println(parental.getFatherName());
        return new ResponseEntity<>(students, HttpStatus.ACCEPTED);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") Long id) {
        Student student = this.studentRepo.findById(id).get();

//        Hibernate.initialize(student.getParental());
        Parental parental = student.getParental();
        System.out.println(parental.getFatherName());
        System.out.println(parental.getFatherName().equals("Peter Carpenter"));
        Parental  parental1 = new Parental()
                .setFatherName(parental.getFatherName());
        student.setParental(parental1);


        return new ResponseEntity<>(student, HttpStatus.ACCEPTED);
    }

    @GetMapping("/parents")
    public ResponseEntity<?> getParents() {
        List<Parental> parentalList = parentalRepo.findAll();
        parentalList.forEach(p-> System.out.println(p.getStudent().getId()));
        return new ResponseEntity<>(parentalList, HttpStatus.ACCEPTED);
    }
}
