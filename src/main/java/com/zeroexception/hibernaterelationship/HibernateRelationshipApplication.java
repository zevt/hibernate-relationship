package com.zeroexception.hibernaterelationship;

import com.zeroexception.hibernaterelationship.model.Address;
import com.zeroexception.hibernaterelationship.model.Contact;
import com.zeroexception.hibernaterelationship.model.Student;
import com.zeroexception.hibernaterelationship.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
                .setStreetAddress1("1212 Plano road")
                .setStreetAddress2("apt 101")
                .setCity("Plano")
                .setZip("75000");

        Contact contact = new Contact()
                .setEmail("john@gmail.com")
                .setPhoneNumber("123-456-7415");

        Student student = new Student()
                .setFirstName("John")
                .setLastName("Carpenter")
                .setAddress(address)
                .setContact(contact);

        this.studentRepo.save(student);
    }
}
