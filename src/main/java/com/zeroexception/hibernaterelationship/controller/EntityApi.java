package com.zeroexception.hibernaterelationship.controller;

import com.zeroexception.hibernaterelationship.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Viet Quoc Tran vt
 * on 4/15/18.
 * www.zeroexception.com
 */


@RestController
@RequestMapping("/v1")
public class EntityApi {


    @Autowired
    private StudentRepository studentRepo;


    @GetMapping("/students")
    public ResponseEntity<?> getStudents() {
        return new ResponseEntity<>(this.studentRepo.findAll(), HttpStatus.ACCEPTED);
    }
}
