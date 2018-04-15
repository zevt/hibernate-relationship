package com.zeroexception.hibernaterelationship;

import com.zeroexception.hibernaterelationship.model.Address;
import com.zeroexception.hibernaterelationship.model.Contact;
import com.zeroexception.hibernaterelationship.model.Student;
import com.zeroexception.hibernaterelationship.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
public class HibernateRelationshipApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(HibernateRelationshipApplication.class, args);
    }


    @Autowired
    private StudentRepository studentRepo;
    @Override
    public void run(String... args) throws Exception {

        Address address = new Address()
                .setAddressLine1("1212 Plano road")
                .setAddressLine2("apt 101")
                .setCity("Plano")
                .setState("Texas")
                .setZip("75000");

        Contact contact = new Contact()
                .setEmail("john@gmail.com")
                .setPhoneNumber("123-456-7415");

        Set<String> majors = new HashSet<>();
        majors.add("Physics");
        majors.add("Math");

        Map<String, String> previousSchools = new HashMap<>();
        previousSchools.put("UTD", "11");
        previousSchools.put("UTA", "12");

        Student student = new Student()
                .setFirstName("John")
                .setLastName("Carpenter")
                .setAddress(address)
                .setContact(contact)
                .setMajors(majors)
                .setPreviousSchools(previousSchools);


        this.studentRepo.save(student);
    }
}
