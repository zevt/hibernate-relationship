package com.zeroexception.hibernaterelationship;

import com.zeroexception.hibernaterelationship.model.entity.Address;
import com.zeroexception.hibernaterelationship.model.entity.Contact;
import com.zeroexception.hibernaterelationship.model.entity.Parental;
import com.zeroexception.hibernaterelationship.model.entity.Student;
import com.zeroexception.hibernaterelationship.model.userrole.Role;
import com.zeroexception.hibernaterelationship.model.userrole.User;
import com.zeroexception.hibernaterelationship.repository.MachineTypeRepository;
import com.zeroexception.hibernaterelationship.repository.ParentalRepository;
import com.zeroexception.hibernaterelationship.repository.RoleRepository;
import com.zeroexception.hibernaterelationship.repository.StudentRepository;
import com.zeroexception.hibernaterelationship.repository.UserRepository;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateRelationshipApplication implements CommandLineRunner {

  @Autowired private StudentRepository studentRepo;
  @Autowired private MachineTypeRepository machineTypeRepo;
  @Autowired private ParentalRepository parentalRepo;
  @Autowired private UserRepository userRepo;
  @Autowired private RoleRepository roleRepo;

  public static void main(String[] args) {
    SpringApplication.run(HibernateRelationshipApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    initStudents();
    initMachines();
    initUser();
  }

  private void initStudents() {
    Address address =
        new Address()
            .setAddressLine1("1000 Plano Road")
            .setAddressLine2("apt 101")
            .setCity("Plano")
            .setState("Texas")
            .setZip("75000");

    List<Address> addresses = new LinkedList<>();
    addresses.add(address);
    address =
        new Address()
            .setAddressLine1("2222 Preston Road")
            .setCity("Plano")
            .setState("Texas")
            .setZip("75050");
    addresses.add(address);

    Contact contact = new Contact().setEmail("john@gmail.com").setPhoneNumber("123-456-7415");

    Set<String> majors = new HashSet<>();
    majors.add("Physics");
    majors.add("Math");

    Map<String, String> previousSchools = new HashMap<>();
    previousSchools.put("UTD", "11");
    previousSchools.put("UTA", "12");

    Parental parental = new Parental().setFatherName("Peter Carpenter");

    //        parental = this.parentalRepo.save(parental);

    Student student =
        new Student()
            .setFirstName("John")
            .setLastName("Carpenter")
            .setAddresses(addresses)
            .setContact(contact)
            .setMajors(majors)
            .setParental(parental)
            .setPreviousSchools(previousSchools);

    Student student1 = this.studentRepo.save(student);
    System.out.println(student1.getId());
  }

  private void initMachines() {}

  private void initUser() {
    User user = new User();
    user.setName("Joe");

    Role role = roleRepo.findById("ADMIN").get();

    user.getRoles().add(role);
    this.userRepo.save(user);

    role = roleRepo.findById("USER").get();
    user = userRepo.findById(user.getId()).get();
    user.getRoles().add(role);

    this.userRepo.save(user);
  }
}
